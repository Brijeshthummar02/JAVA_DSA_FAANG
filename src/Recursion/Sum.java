package Recursion;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(2,5));

        System.out.println(sumN(50));
    }

    static int sum(int a, int b) {
    // BOTH CONDITION WILL WORK
       // int c = a + b;
       // return c;

        return a + b;
    }

    // For N No Sum
    static int sumN(int n) {
        if(n <= 1){
            return 1;
        }
        return  n + sumN(n-1);
    }
}
