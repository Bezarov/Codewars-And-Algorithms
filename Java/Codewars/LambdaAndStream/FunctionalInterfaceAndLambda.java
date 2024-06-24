package Codewars.LambdaAndStream;

/*
Task: Implementing a functional interface
Create a functional Calculator interface with a method int calculate(int a, int b). Write multiple implementations of this interface using lambda expressions:

Addition of two numbers.
Subtracting the second number from the first.
Multiplying two numbers.
Divide the first number by the second.
 */

@FunctionalInterface
public interface FunctionalInterfaceAndLambda {
    int calculate(int a, int b);
}

class Main {
    public static void main(String[] args) {
        FunctionalInterfaceAndLambda add = (a, b) -> a + b;
        FunctionalInterfaceAndLambda subtract = (a, b) -> a - b;
        FunctionalInterfaceAndLambda multiply = (a, b) -> a * b;
        FunctionalInterfaceAndLambda divide = (a, b) -> a / b;

        System.out.println(add.calculate(10, 20));
        System.out.println(subtract.calculate(20, 10));
        System.out.println(multiply.calculate(2, 2));
        System.out.println(divide.calculate(6, 2));
    }
}
