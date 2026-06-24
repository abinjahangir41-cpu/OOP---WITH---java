import java.util.Scanner;

public class even {
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
        int[] allNumbers = new int[maxPossibleSize];
        
        int fillIndex = 0;
        int currentNum = start;
        while (currentNum <= end) {
            allNumbers[fillIndex] = currentNum;
            fillIndex++;
            currentNum++;
        }

        System.out.print("Even numbers in the range: ");
        int checkIndex = 0;
        do {
            if (allNumbers[checkIndex] % 2 == 0) {
                System.out.print(allNumbers[checkIndex] + " ");
            }
            checkIndex++;
        } while (checkIndex < fillIndex);
        
        System.out.println();
        scanner.close();
    }
}