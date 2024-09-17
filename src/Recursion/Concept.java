package Recursion;

public class Concept {
    public static void main(String[] args) {
        concept(8);
    }
    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--); // infinite loop --> stack overflow
        concept(--n);
//        n-- vs --n
    }
}
