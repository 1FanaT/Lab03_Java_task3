import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмірність матриці n: ");
        int n = scanner.nextInt();

        // Створення матриці з випадковими значеннями в інтервалі від -n до n
        int[][] matrix = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2 * n + 1) - n;
            }
        }

        // Виведення матриці на консоль
        System.out.println("Матриця:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Обчислення норми матриці
        int maxRowSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += Math.abs(matrix[i][j]);
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
            }
        }

        System.out.println("Норма матриці: " + maxRowSum);
    }
}
