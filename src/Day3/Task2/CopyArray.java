// 2) Declare and initialize an array with four arbitrary whole numbers.
// Write a Java program to copy this array by iterating it.
package Day3.Task2;

public class CopyArray {
    public static void main(String[] args) {

        int arr[] = {21, 60, 34, 65};
        int[] copy = new int[4];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        for(int i = 0;i < copy.length;i++){
            System.out.print(copy[i]+" ");
        }
    }
}
