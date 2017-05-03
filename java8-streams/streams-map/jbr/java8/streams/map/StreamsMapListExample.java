package jbr.java8.streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamsMapListExample {

  public static void main(String[] args) {
    List<String> list = Arrays.asList(new String[] { "aa1", "cc1", "dd2", "bb1", "aa2", "cc2", "bb2", "dd1" });

    System.out.println("===Original Array Values");
    list.stream()
        .forEach(System.out::println);

    System.out.println("\n===Sorted Array Values");
    list.stream()
        .sorted()
        .forEach(System.out::println);

    System.out.println("\nFilter - ends with 2");
    list.stream()
        .filter(p -> p.endsWith("2"))
        .forEach(System.out::println);
  }
}
