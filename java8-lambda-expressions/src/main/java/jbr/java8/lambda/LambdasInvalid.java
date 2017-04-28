package jbr.java8.lambda;

public class LambdasInvalid {

  public static void main(String[] args) {
    // 1. 
    (String s) -> return "Age is: " + 5;
    
    // 2. 
    (String s) -> {return "invalid";};
  }
}
