//1) Ask user to input two numbers, compare them and output result:
//   Input:
//       Enter value a: 10
//       Enter value b: 10
//   Expected output:
//       is 10 equal to 10? - true
//       is 10 less than 10? - false
//       is 10 less or equal to 10? - true
//       is 10 greater than 10? - false
//       is 10 greater or equal to 10? - true
package Day2;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = inputNumber.nextInt();

        System.out.println("Enter second number");
        int b = inputNumber.nextInt();

        if (a == b) {
            System.out.println("is " + a + " equal to " + b + "? - true");
        } else {
            System.out.println("is " + a + " equal to " + b + "? - false");
        }

        if (a < b) {
            System.out.println("is " + a + " less than " + b + "? - true");
        } else {
            System.out.println("is " + a + " less than " + b + "? - false");
        }

        if (a <= b) {
            System.out.println("is " + a + " less or equal to " + b + "? - true");
        } else {
            System.out.println("is " + a + " less or equal to " + b + "? - false");
        }

        if (a > b) {
            System.out.println("is " + a + " greater than " + b + "? - true");
        } else {
            System.out.println("is " + a + " greater than " + b + "? - false");
        }

        if (a >= b) {
            System.out.println("is " + a + " greater or equal to " + b + "? - true");
        } else {
            System.out.println("is " + a + " greater or equal to " + b + "? - false");
        }
    }
}
