package company;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {

        Scanner inputBool = new Scanner(System.in);

        System.out.println("Enter first Bool");
        boolean b1 = inputBool.nextBoolean();

        System.out.println("Enter second Bool");
        boolean b2 = inputBool.nextBoolean();

        if (b1 == b2) {
            System.out.println("Is b1 and b2 equal? - true");
        } else {
            System.out.println("Is b1 and b2 equal? - false");
        }
    }
}
