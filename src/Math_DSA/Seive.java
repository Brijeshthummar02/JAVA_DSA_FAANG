package Math_DSA;
// Sieve Of Eratosthens

public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        System.out.println(primes[0]);
        sieve(n, primes);
    }

    // false in array means number is prime
    static void sieve(int n, boolean[] primes){
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                for (int j = i*2; j <= n ; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
