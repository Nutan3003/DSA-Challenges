import java.util.Scanner;

public class CountingBits {

    // Method to check if the i-th bit of n is set
    public static boolean checkKthBit(int n, int i) {
      return (n & (1 << i)) != 0;
    }

    // Method to count the number of set bits in n
    static int setBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) { // Loop through all 32 bits of an integer
            if (checkKthBit(n, i)) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        System.out.println("Number of set bits: " + setBits(n));
    }
}
