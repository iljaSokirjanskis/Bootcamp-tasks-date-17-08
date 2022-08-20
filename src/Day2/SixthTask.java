//6) Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true:
//    1) a and b is equal
//    2) a is less than 0 and b is greater than 0
//    3) both of them are greater than 100
//    otherwise output "false":
//    Examples:
//        a is -1 and b is -2 -> false
//        a is -2 and b is 1 -> true
//        a is -1 and b is -1 -> true
//        a is 101 and b is 102 -> true
//        a is 99 and b is 200 -> false
package Day2;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = inputNumber.nextInt();

        System.out.println("Enter second number");
        int b = inputNumber.nextInt();
        if ((a == b) || (a < 0 && b > 0) || (a > 100 && b > 100)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
