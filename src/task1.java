import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Enter x and y: ");
        Scanner in = new Scanner(System.in);
        float s = in.nextFloat();
        double p = 4 * Math.sqrt(s);
        System.out.println("p=" + p);
        in.close();
    }
}
