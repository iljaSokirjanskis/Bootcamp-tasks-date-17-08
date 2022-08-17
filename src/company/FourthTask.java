package company;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter number");
        int number = inputNumber.nextInt();

        if (number % 2 == 0) {
            System.out.println(" false ");
        } else {
            System.out.println(" true ");
        }
    }
}
