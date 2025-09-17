import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 15;

        System.out.print("Введіть розмірність матриці n (n ≤ 15): ");
        int n = sc.nextInt();
        if (n > MAX || n <= 0) {
            System.out.println("Некоректне значення n!");
            return;
        }

        int[][] X = new int[n][n];
        System.out.println("Введіть елементи матриці " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                X[i][j] = sc.nextInt();
            }
        }

        boolean[] L = new boolean[n]; // логічний вектор

        for (int i = 0; i < n; i++) {
            int neg = 0, pos = 0;
            for (int j = 0; j < n; j++) {
                if (X[i][j] < 0) neg++;
                else if (X[i][j] > 0) pos++;
            }
            L[i] = neg > pos; // true, якщо від’ємних більше ніж додатних
        }

        System.out.println("Логічний вектор L:");
        for (int i = 0; i < n; i++) {
            System.out.println("L[" + i + "] = " + L[i]);
        }
    }
}