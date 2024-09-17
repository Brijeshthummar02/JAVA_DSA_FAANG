package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(12349));
    }

    static int sumDigits(int n) {
//        int rem = n % 10;
//        int N = n / 10;
//        return sumDigits(N) + rem;
        // you can use above or you can use below one

        if(n == 0){
            return 0;
        }
       return n % 10 + sumDigits(n / 10);

    }
}

