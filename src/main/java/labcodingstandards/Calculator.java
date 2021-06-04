// Copyright (C) 2020
// All rights reserved
package labcodingstandards;

import java.util.Scanner;

/**
 * @author Karla Duran
 *
 */
public class Calculator { //CHECKSTYLE:OFF
/**
* @param args Main function
*/
public static void main(final String[] args) {
Scanner reader = new Scanner(System.in);
//this is a comment
System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");

        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;

        while (true) {
        System.out.print("Enter first number: ");
        input = reader.nextLine();

            try {
            first = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        while (true) {
        System.out.print("Enter second number: ");
        input = reader.nextLine();

            try {
            second = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal = new Calculator();
        String result = cal.oper(first, second, operator);

        System.out.printf(result);
reader.close();
}
//CHECKSTYLE:ON

/**
* @param fi
* @param se
* @param op
* @return return the result of operation
*/
private String oper(final double fi, final double se, final char op) {
double result = 0;
switch (op) {

            case '1':
                result = fi + se;
                break;
            case '2':
                result = fi - se;
                break;
            case '3':
                result = fi * se;
                break;
            case '4':
                result = fi / se;
                break;
            default:
        return "Error! operator is not correct";
        }
return "The result is: " + result;
}
}
