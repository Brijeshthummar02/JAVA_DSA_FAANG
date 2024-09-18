package Basics;

public class Overloading {
    public static void main(String[] args) {
        fun(43);
        fun("sam");
       int ans = sum(2,3);
        System.out.println(ans);
    }
        static int sum(int a, int b) {
        return a + b;
        }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
// happens at runtime, choosing which one will be prefered
