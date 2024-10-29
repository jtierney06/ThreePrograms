public class FactorPrimeChecker {

    
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

    public static void main(String[] args) {
        
        System.out.println(countFactors(24)); 
        System.out.println(isPrime(27)); 
        System.out.println(isPrime(47)); 
    }
}
