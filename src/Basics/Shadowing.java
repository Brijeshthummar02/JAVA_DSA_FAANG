package Basics;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 6
    // cuz lower lvl is over riding the upper lvl, hence higher lvl is shadowed.
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this
//        System.out.println(x);..// scope will begin when value is initialised
        x = 40; // shadowing begins when local variable is declared
        System.out.println(x); // 40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
