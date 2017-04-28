package jbr.java8.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Performance check for forEach.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */

public class ForEachSpeedChecker {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < 10000; i++) {
      numbers.add(random.nextInt());
    }

    long stTime = System.currentTimeMillis();
    int result = 0;
    for (Integer i : numbers) {
      result = ((i * 49) / 223) % 19;
    }
    System.out.println("for loop took: " + (System.currentTimeMillis() - stTime) + " milliseconds.");

    long strTime = System.currentTimeMillis();
    numbers.forEach(i -> System.out.println(((i * 49) / 223) % 19));
    System.out.println("forEach took: " + (System.currentTimeMillis() - strTime) + " milliseconds.");
  }
}
