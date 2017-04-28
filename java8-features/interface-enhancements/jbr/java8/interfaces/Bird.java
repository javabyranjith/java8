package jbr.java8.interfaces;

public interface Bird {

  default void speak() {
    System.out.println("i can speak :)");
  }

  static void fly() {
    System.out.println("i can fly :)");
  }
}
