/*
NumbersDemo
In a class called NumbersDemo.java, whose main method holds two integer variables.
Prompt the user for the values of those variables.
Pass each variable to the methods, displayTwiceTheNumber(), displayNumberPlusFive(), and displayNumberSquared().
Create each method to perform the task its name implies.
 */


import java.util.Scanner;

public class NumbersDemo {

    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nNumber: ");
        num1 = scanner.nextInt();
        showCalculation(num1);

        System.out.print("\nNumber: ");
        num2 = scanner.nextInt();
        showCalculation(num2);
    }

    public static int displayTwiceTheNumber(int number) {
        return number + number;
    }

    public static int displayNumberPlusFive(int number) {
        return number + 5;
    }

    public static int displayNumberSquared(int number) {
        return number * number;
    }

    public static void showCalculation(int number) {
        System.out.println();
        System.out.printf("%s%d%s", "Twice Number: ", displayTwiceTheNumber(number), "\n");
        System.out.printf("%s%d%s", "Number Plus Five: ", displayNumberPlusFive(number), "\n");
        System.out.printf("%s%d%s", "Number Squared: ", displayNumberSquared(number), "\n");
    }
}
