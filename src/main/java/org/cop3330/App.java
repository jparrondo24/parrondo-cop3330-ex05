/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int num1 = in.nextInt();
        System.out.print("What is the second number? ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.printf("%d + %d = %d\n", num1, num2, sum);
        System.out.printf("%d - %d = %d\n", num1, num2, difference);
        System.out.printf("%d * %d = %d\n", num1, num2, product);
        System.out.printf("%d / %d = %d\n", num1, num2, quotient);
    }
}
