package jbr.java8.foreach;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Collection.forEach example for Map.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class ForEachMap {

  public static void main(String[] args) {
    Map<String, String> map = new LinkedHashMap<>();
    map.put("firstname", "Ranjith");
    map.put("lastname", "Sekar");
    map.put("address", "Chennai");

    System.out.println("Before Java 8");
    System.out.println("============");
    for (Map.Entry<String, String> e : map.entrySet()) {
      System.out.println(e.getKey() + " : " + e.getValue());
    }
    System.out.println("--------------------------------------");

    System.out.println("Using Java 8");
    System.out.println("============");
    map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    System.out.println("--------------------------------------");
  }
}
