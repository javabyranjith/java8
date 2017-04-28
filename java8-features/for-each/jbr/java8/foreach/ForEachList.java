package jbr.java8.foreach;

import java.util.Arrays;
import java.util.List;

/**
 * Collection.forEach example for List.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class ForEachList {

  public static void main(String[] args) {
    List<String> list = Arrays.asList(new String[] { "Ranjith", "Sekar", "Chennai" });

    System.out.println("Before Java 8");
    System.out.println("============");
    double j7StartTime = System.currentTimeMillis();
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("Time Took: " + (System.currentTimeMillis() - j7StartTime));
    System.out.println("--------------------------------------");

    System.out.println("Using Java 8");
    System.out.println("============");
    // list.forEach((s) -> System.out.println(s));
    double j8StartTime = System.currentTimeMillis();
    list.forEach(System.out::println);
    System.out.println("Time Took: " + (System.currentTimeMillis() - j8StartTime));
    System.out.println("--------------------------------------");
  }
}
