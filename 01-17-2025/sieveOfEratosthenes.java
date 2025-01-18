import java.util.*;

class sieveOfEratosthenes {
    public static ArrayList<Integer> sieveOfEratosthenes1(int N) {
        // Boolean array to mark prime numbers
        boolean[] isprime = new boolean[N + 1];
        Arrays.fill(isprime, true); // Assume all numbers are prime
        isprime[0] = isprime[1] = false; // 0 and 1 are not prime numbers

        // Start the sieve process
        for (int num = 2; num * num <= N; num++) {
            if (isprime[num]) { // If the number is still marked as prime
                for (int j = num * num; j <= N; j += num) {
                    isprime[j] = false; // Mark all multiples as non-prime
                }
            }
        }

        // Collect all prime numbers
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isprime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N:");
        int N = sc.nextInt(); // Input the range
        System.out.println("Prime numbers up to " + N + ": " + sieveOfEratosthenes1(N));
    }
}
