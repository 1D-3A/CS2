import java.util.*;
public class FutureValue {
    public static double futureValue(double P, double i, double t) {
        double F = P * Math.pow(1 + i, t);
        return F;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the Present Value: $");
        double P = console.nextDouble();

        System.out.print("Enter the Monthly Interest Rate Percentage: ");
        double i = console.nextDouble();

        System.out.print("Enter the Number of Months: ");
        double t = console.nextDouble();

        System.out.printf("Future Value: $%.2f\n", futureValue(P, i / 100, t));
        console.close();
    }
}