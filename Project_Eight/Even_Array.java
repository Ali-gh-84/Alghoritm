package Project_Eight;

import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter size of array : ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("size is invalid");
        }

        int[] arr = new int[n];

        int count = 0;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter a number :");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                even += 1;
            }else if (i % 2 != 0 && arr[i] % 2 == 0){
                odd += 1;
            }
        }
        if (even == 0) {
            System.out.println("array is even");
        }else if (even == odd) {
            count = even;
            System.out.println("count of change is : " + count);
        }else {
            System.out.println("Array is not changed !");
        }
    }
}

