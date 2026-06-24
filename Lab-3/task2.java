import java.util.Scanner;

public class pprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Invalid range. Starting number must be less than or equal to ending number.");
            scanner.close();
            return;
        }

        int maxPossibleSize = (end - start) + 1;
        if (maxPossibleSize < 0) maxPossibleSize = 0;
        int[] tempPrimes = new int[maxPossibleSize];
        int primeCount = 0;

        for (int i = start; i <= end; i++) {
            if (i < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                tempPrimes[primeCount] = i;
                primeCount++;
            }
        }

        int[] primeNumbers = new int[primeCount];
        System.arraycopy(tempPrimes, 0, primeNumbers, 0, primeCount);

        System.out.print("Prime numbers in the range: ");
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.print(primeNumbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}