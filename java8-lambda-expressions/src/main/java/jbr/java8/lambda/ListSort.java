package jbr.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting a list using Lambda Expression
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class ListSort {

  public static void main(String[] args) {
    /** java 7 sorting **/
    List<String> caps = Arrays.asList(new String[] { "C", "B", "E", "D", "A" });
    System.out.println("Before Sorting: " + caps);
    Collections.sort(caps, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.compareTo(s2);
      }
    });
    System.out.println("After Sorting: " + caps);

    // java 8 - using lamda
    List<String> small = Arrays.asList(new String[] { "c", "b", "e", "d", "a" });
    System.out.println("\nBefore Sorting: " + small);
    Collections.sort(small, (s1, s2) -> s1.compareTo(s2));
    System.out.println("After Sorting: " + small);

    List<Integer> numbers = Arrays.asList(new Integer[] { 4, 2, 3, 5, 1 });
    System.out.println("\nBefore Sorting: " + numbers);
    Collections.sort(numbers, (s1, s2) -> String.valueOf(s1)
        .compareTo(String.valueOf(s2)));
    System.out.println("After Sorting: " + numbers);
  }

}
