package Lecture_12;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 42;
        arr[2] = 63;
        arr[3] = 74;
        arr[4] = 25;
        System.out.println(arr[1]);

        //input using loops
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // this is best method

//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }
//        for (int num : arr) { // for every element in array print the element
//            System.out.println(num + " "); // here num represents element of the array
//        }
        //Arrray of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Raj";
        System.out.println(Arrays.toString(str));
    }

}
