package jbr.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jbr.java8.model.Gender1;
import jbr.java8.model.Person1;

/**
 * Java 8 Stream basics.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class StreamBasics {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 6, 3, 7, 4, 5, 8, 9, 10);

    numbers.stream()
        .filter(n -> n > 3)
        .sorted()
        .forEach(System.out::println);

    List<String> chars = Arrays.asList(new String[] { "B", "C", "A" });

    chars.stream()
        .forEachOrdered(System.out::println);

    List<Person1> persons = Arrays
        .asList(new Person1[] { new Person1("Sekar", "Chinnappan", Gender1.MALE, "Hydrabad", 55, 88000),
            new Person1("Ranjith", "Sekar", Gender1.MALE, "Chennai", 23, 96000),
            new Person1("Kabilan", "Ranjith", Gender1.MALE, "Bangalore", 3, 86000),
            new Person1("Nivedha", "Ranjith", Gender1.FEMALE, "Delhi", 1, 97000) });

    System.out.println("\nPersons are in Chennai!!");
    persons.stream()
        .filter(p -> p.getAddress()
            .equalsIgnoreCase("Chennai"))
        .forEach(p -> System.out.println(p.getFirstname()));

    // print even
    // Way 1
    numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);

    // Way 2 - collectors
    List<Integer> even = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
    even.forEach(System.out::println);

    System.out.println("Stream.iterate:");
    Stream.iterate(1, e -> e + 1)
        .filter(e -> e % 2 == 0)
        .limit(10)
        .forEach(System.out::println);
  }
}
