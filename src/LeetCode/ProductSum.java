package LeetCode;

class ProductSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
   static public int subtractProductAndSum(int n) {
        int productOfDigits = 1;
        int sumOfDigits = 0;

        while (n > 0) { // base condition

            int lastDigit = n % 10; // which will give last digit from n no. of digits

            productOfDigits *= lastDigit; // productOfDigit = productOfDigit * lastDigit;
            sumOfDigits += lastDigit;  // sumOfDigit = sumOfDigit + lastDigit;
            n /= 10; // n = n / 10; which will seprate last digit from n no.
        }
        return productOfDigits - sumOfDigits;
    }
}