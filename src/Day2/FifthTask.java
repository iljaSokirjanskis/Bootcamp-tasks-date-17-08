//5) Write a program which reads boolean value from user and prints out the opposite value:
//    Example input:
//        Enter boolean value: true
//    Expected output:
//        Opposite of "true" is "false"
package Day2;

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
