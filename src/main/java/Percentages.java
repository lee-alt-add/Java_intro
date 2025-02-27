/*
Percentages
In a class called Percentages.java, whose main method holds two double variables.
Prompt the user for the values of those variables.
Pass both variable to a method named computePercentages() that displays the two values and the value of the first number as a percentage of the second one.
 */


import java.util.Scanner;

public class Percentages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.print("1st Number: ");
        num1 = scanner.nextDouble();
        System.out.print("2nd Number: ");
        num2 = scanner.nextDouble();
        computePercentages(num1, num2);
        scanner.close();
    }

    private static void computePercentages(double number1, double number2) {
        System.out.printf("%.2f%s%.2f%s%.2f\n", number1, " ", number2, " ", number1/ number2 * 100);
    }
}
