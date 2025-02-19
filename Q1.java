import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // Input the 3x3 matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Left diagonal elements (i == j): matrix[0][0], matrix[1][1], matrix[2][2]
        int leftMin = matrix[0][0], leftMax = matrix[0][0];

        // Right diagonal elements (i + j == 2): matrix[0][2], matrix[1][1], matrix[2][0]
        int rightMin = matrix[0][2], rightMax = matrix[0][2];

        for (int i = 0; i < 3; i++) {
            // Left diagonal
            if (matrix[i][i] < leftMin) leftMin = matrix[i][i];
            if (matrix[i][i] > leftMax) leftMax = matrix[i][i];

            // Right diagonal
            if (matrix[i][2 - i] < rightMin) rightMin = matrix[i][2 - i];
            if (matrix[i][2 - i] > rightMax) rightMax = matrix[i][2 - i];
        }

        // Output results
        System.out.println("Left Diagonal -> Min: " + leftMin + ", Max: " + leftMax);
        System.out.println("Right Diagonal -> Min: " + rightMin + ", Max: " + rightMax);

        scanner.close();
    }
}

