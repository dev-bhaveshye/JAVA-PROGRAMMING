public class Q2 {
    public static void main(String[] args) {
        int evenCount = 0, oddCount = 0;
        int evenSum = 0, oddSum = 0;

        // Loop from 1 to 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) { // Check if even
                evenCount++;
                evenSum += i;
            } else { // Else it's odd
                oddCount++;
                oddSum += i;
            }
        }

        // Print the results
        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Total Odd Numbers: " + oddCount);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }
}

