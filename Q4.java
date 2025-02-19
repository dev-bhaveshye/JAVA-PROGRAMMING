import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prime number check
        System.out.print("Enter a number to check if it's prime: ");
        int primeNum = scanner.nextInt();
        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is a Prime Number.");
        } else {
            System.out.println(primeNum + " is NOT a Prime Number.");
        }

        // Armstrong number check
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int armstrongNum = scanner.nextInt();
        if (isArmstrong(armstrongNum)) {
            System.out.println(armstrongNum + " is an Armstrong Number.");
        } else {
            System.out.println(armstrongNum + " is NOT an Armstrong Number.");
        }

        // Fibonacci series generation
        System.out.print("Enter the number of Fibonacci terms: ");
        int fibonacciCount = scanner.nextInt();
        System.out.println("Fibonacci Series:");
        printFibonacci(fibonacciCount);

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;
        while (temp > 0) {  // Count number of digits
            temp /= 10;
            digits++;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); // Raise to power of total digits
            temp /= 10;
        }
        return sum == num;
    }

    // Function to print Fibonacci series
    public static void printFibonacci(int count) {
        int a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
