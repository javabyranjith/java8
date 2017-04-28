package jbr.java8.method.reference;

import java.util.Arrays;
import java.util.List;

/**
 * Method reference example for List.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class MethodRefereceList {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    System.out.println("Before Java 8");
    System.out.println("============");
    for (Integer s : list) {
      System.out.print(s + " ");
    }

    System.out.println("\n\nUsing Java 8");
    System.out.println("============");
    list.forEach(System.out::print); // simple method reference.

    System.out.println("\n----------------------");
    list.stream()
        .map(Integer::valueOf) // calling static method.
        .forEach(System.out::print); // calling instance method.

    System.out.println("\n----------------------");
    list.stream()
        .map(e -> e.toString())
        .forEach(System.out::print);

    System.out.println("\n----------------------");
    list.stream()
        .map(e -> String.valueOf(e))
        .map(e -> e.toString())
        .forEach(System.out::print);
  }
}
