package company;

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
