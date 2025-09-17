import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Enter x and y: ");
        Scanner sc = new Scanner(System.in);

        // ВАРІАНТ 1: x, y як double → результат double
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double result1 = 1.0 / (x1 * y1) + (1.0 / (x1 * x1 + y1 * y1)) * (x1 - y1);
        System.out.println("Варіант 1 (double → double): " + result1);

        System.out.println("Enter x and y: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double result2 = 1.0 / (x2 * y2) + (1.0 / (x2 * x2 + y2 * y2)) * (x2 - y2);
        System.out.println("Варіант 2 (int → double): " + result2);

        System.out.println("Enter x and y: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double temp = 1.0 / (x3 * y3) + (1.0 / (x3 * x3 + y3 * y3)) * (x3 - y3);
        int result3 = (int) temp; // або Math.round(temp)
        System.out.println("Варіант 3 (double → int): " + result3);

        sc.close();
    }
}