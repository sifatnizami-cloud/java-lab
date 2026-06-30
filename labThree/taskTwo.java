import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();
        int count = 0;

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primes.add(num);
                count++;
            }
        }

        System.out.println("Total prime numbers between " + start + " and " + end + " = " + count);
        System.out.println("Prime numbers:");
        for (int p : primes) {
            System.out.print(p + " ");
        }
        System.out.println();

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
