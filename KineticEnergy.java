package CS2;
import java.util.*;
public class KineticEnergy {
    public static double kineticEnergy(double m, double v) {
        double KV = 0.5 * m * v * v;
        return KV;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the Mass (kg): ");
        double m = console.nextDouble();

        System.out.print("Enter the Velocity (m/s): ");
        double v = console.nextDouble();

        double KV = kineticEnergy(m, v);

        System.out.printf("Mass: %.2f kg \nVelocity: %.2f m/s \nKinetic Energy: %.2f J", m, v, KV);

        console.close();
    }
}