package com.brijesh;

public class Conditional {
    public static void main(String[] args) {
        /*
        Syntax of if statements:
        if (boolean exxpression T or F){
                // body
       } else {
            // do this
       }
        */

        int salary = 25400;
//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//
//        }

        // multiple if-else

        if (salary > 10000){
            salary += 2000; // salary = salary + 2000
        } else if (salary > 200000){
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}