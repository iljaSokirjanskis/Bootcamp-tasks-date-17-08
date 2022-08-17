package company;

import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter number");
        int number = inputNumber.nextInt();


        if (number % 2 == 0) {
            System.out.println(" true ");
        } else {
            System.out.println(" false ");
        }
    }
}
