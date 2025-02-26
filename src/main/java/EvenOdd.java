/*
EvenOdd
In a file called EvenOdd.java, create an application that prompts the user to enter an integer.
Pass the integer to a method that determines weather the integer is even or odd and returns a boolean value.
In the main method, display whether the number is even or odd.
 */

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (is_even(scanner.nextInt())) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        scanner.close();
    }

    public static boolean is_even(int number) {
        return number % 2 == 0;
    }
}