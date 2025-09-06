public class CelsiusTemperatureTable {
    public static double celsius(double f) {
        double c = (5.0 / 9.0) * (f - 32);
        return c;
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%d° Fahrenheit = %.2f° Celsius\n", i, celsius(i));
        }
    }
}