package jbr.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Examples to obtain/create Stream.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class ObtainStreams {

  public static void main(String[] args) {
    // 1 using array
    array();

    // 2 Using list - stream & parallel stream
    list();

    // 3 using set
    set();

    IntStream ints = IntStream.range(3, 10);
    System.out.println(ints.average());
  }

  public static void array() {
    System.out.println("Using array:");
    String[] animals = new String[] { "Dog", "Elephant", "Cat", "Fox" };

    Stream<String> stream = Stream.of(animals);
    stream.forEach(System.out::println);
  }

  public static void list() {
    System.out.println("\nUsing list:");
    List<String> vowels = Arrays.asList(new String[] { "A", "E", "I", "O", "U" });
    Stream<String> stream = vowels.stream();
    stream.forEach(System.out::println);
    stream = vowels.parallelStream();
    stream.forEach(System.out::println);
  }

  public static void set() {
    System.out.println("\nUsing set:");
    Set<Integer> set = new HashSet<>();
    set.addAll(Arrays.asList(new Integer[] { 1, 2, 3 }));
    Stream<Integer> stream1 = set.stream();
    stream1.forEach(System.out::println);
    Stream<Integer> pstream = set.parallelStream();
    pstream.forEach(System.out::println);
  }
}
