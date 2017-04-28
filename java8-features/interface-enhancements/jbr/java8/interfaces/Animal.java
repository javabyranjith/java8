package jbr.java8.interfaces;

public interface Animal {

  void food();

  default void speak() {
    System.out.println("i can't speak :(");
  }

  static void fly() {
    System.out.println("i can't fly :(");
  }
}
