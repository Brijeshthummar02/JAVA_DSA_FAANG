package com.brijesh;

public class Loops {
    public static void main(String[] args) {
        // Q: print numbers from 1 to 5

        /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
            // body
            }
         */
        //Q: print numbers from 1 to 5
//        for(int num = 1; num <= 10; num++) {
//            System.out.println(num);
//        }

        // while loop
        /*
        syntax
        while(condition) {
                // body
                }
         */
//        int num = 1;
//        while(num <= 5){
//            System.out.println(num);
//            num++;
//        }
        // do while loop
        /*
        do{
        } while(condition);

         */
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while (n <= 5);

    }
}

