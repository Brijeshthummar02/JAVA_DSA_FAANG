package Intro_Recursion;

public class Message {
    public static void main(String[] args) {
        // write a function, that prints hello world
       msg();


    }
    static void msg(){
        System.out.println("Hello World");
        msg2();
    }
    static void msg2(){
        System.out.println("Hello World");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello World");
    }
}
