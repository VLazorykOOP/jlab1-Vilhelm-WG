import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть радіус r: ");
        double r = sc.nextDouble();

        System.out.print("Введіть кількість елементів масиву n (парне, ≤200): ");
        int n = sc.nextInt();

        double[] A = new double[n];
        System.out.println("Введіть " + n + " елементів масиву:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextDouble();
        }

        int count = 0;
        for (int i = 0; i < n; i += 2) {
            double x = A[i];
            double y = A[i + 1];

            if (x * x + y * y <= r * r) {
                count++;
            }
        }

        System.out.println("Кількість точок у колі: " + count);

        sc.close();
    }
}