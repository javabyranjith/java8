package jbr.java8.interfaces;

/**
 * An Example program for interface enhancements in Java 8
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class Tiger implements Animal, Bird {

  @Override
  public void food() {
    System.out.println("I eat meat");
  }

  // will throw error if 2 interface has same default method.
  // override the method from any one of the interface will resolve the issue.
  @Override
  public void speak() {
    Animal.super.speak();
  }

  public static void main(String[] args) {
    Tiger tiger = new Tiger();
    tiger.food();

    // POSSIBLE
    tiger.speak();
    Animal.fly();

    // NOT POSSIBLE to call static method using instance
    // tiger.fly()
  }

}
