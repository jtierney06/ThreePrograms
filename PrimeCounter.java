public class PrimeCounter {

    
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

  
    public static boolean isPrime(int n) {
        return n > 1 && countFactors(n) == 2;
    }

  
    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 24; 
        System.out.println(countPrimes(n)); 
        System.out.println(countPrimes(100)); 
    }
}
