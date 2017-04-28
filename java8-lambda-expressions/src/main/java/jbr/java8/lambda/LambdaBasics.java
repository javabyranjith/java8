package jbr.java8.lambda;

public class LambdaBasics {

  public static void main(String[] args) {
    // Functional interface with no args
    MyLambda myLambda = () -> System.out.println("Test");
    myLambda.foo();

    // Functional interface with args
    MyMath add = (a, b) -> a + b;
    System.out.println("Sum is: " + add.calc(8, 4));

    MyMath sub = (a, b) -> a - b;
    System.out.println("Subtraction is: " + sub.calc(8, 4));

    MyMath mul = (a, b) -> a * b;
    System.out.println("Multiplication is: " + mul.calc(8, 4));

    MyMath div = (a, b) ->
      {
        if (b == 0) return 0;
        return a / b;
      };
    System.out.println("Division is: " + div.calc(8, 4));
  }
}

@FunctionalInterface
interface MyLambda {
  void foo();
}

@FunctionalInterface
interface MyMath {
  int calc(int a, int b);
}

class MyLambdaImpl implements MyLambda {
  @Override
  public void foo() {
    System.out.println("MyLamdaImpl");
  }
}
