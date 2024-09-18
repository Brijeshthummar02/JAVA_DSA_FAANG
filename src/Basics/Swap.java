package Basics;

public class Swap {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        int temp = a;
//        a = b;
//        b = temp;
//
//    System.out.println(a + " " + b);
//
//    }

// swaping using recursion

public static void main(String[] args) {
    int a = 10, b = 20;
       swap(a, b);// calling the fxn
        System.out.println(a + " " + b); // 10 20
     }
     static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;

         System.out.println(x + " " + y); // 20 10 --> VALUE SWAPED
     }
}