package company;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {

        Scanner inputBool = new Scanner(System.in);

        System.out.println("Enter Bool");
        boolean bool = inputBool.nextBoolean();

        if (bool == true){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
