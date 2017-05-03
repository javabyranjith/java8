package jbr.streams.map;

import java.util.HashMap;
import java.util.Map;

public class StreamsMapMapExample {

  public static void main(String[] args) {

    Map<String, Object> input = new HashMap<>();
    input.put("A", "Anbu");
    input.put("C", "Chandru");
    input.put("B", "Bala");

    Map<String, String> innerMap = new HashMap<>();
    innerMap.put("E", "Edward");
    innerMap.put("D", "Dinesh");
    input.put("G", innerMap);

    // print the map
    System.out.println("===Original Map");
    for (Map.Entry<String, Object> map : input.entrySet()) {
      System.out.println("Key: " + map.getKey() + ", Value: " + map.getValue());
    }

    System.out.println("\n===Print Keys");
    input.entrySet()
        .stream()
        .map(p -> p.getKey())
        .forEach(System.out::println);

    System.out.println("\n===Print Values");
    input.entrySet()
        .stream()
        .map(p -> p.getValue())
        .forEach(System.out::println);

    System.out.println("\n===Sort by Key");
    // Sort by key

  }
}
