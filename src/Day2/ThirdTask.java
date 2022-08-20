//3) Ask user to input a whole number and output true, if it is even number and false if it is odd number
//    Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)-
package Day2;

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
