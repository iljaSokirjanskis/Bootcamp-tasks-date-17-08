package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = inputNumber.nextInt();

        System.out.println("Enter second number");
        int b = inputNumber.nextInt();

        if(a == b){
            System.out.println("is " + a + " equal to " + b + "? - true");
        }else{
            System.out.println("is " + a + " equal to " + b + "? - false");
        }

        if(a < b){
            System.out.println("is " + a + " less than " + b + "? - true");
        }else{
            System.out.println("is " + a + " less than " + b + "? - false");
        }

        if(a <= b){
            System.out.println("is " + a + " less or equal to " + b + "? - true");
        }else{
            System.out.println("is " + a + " less or equal to " + b + "? - false");
        }

        if(a > b){
            System.out.println("is " + a + " greater than " + b + "? - true");
        }else{
            System.out.println("is " + a + " greater than " + b + "? - false");
        }

        if(a >= b){
            System.out.println("is " + a + " greater or equal to " + b + "? - true");
        }else{
            System.out.println("is " + a + " greater or equal to " + b + "? - false");
        }
    }
}
