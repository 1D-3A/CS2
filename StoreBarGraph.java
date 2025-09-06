package CS2;
import java.util.*;
public class StoreBarGraph {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the amount of stores: ");
        int storeAmount = console.nextInt();
        
        String chart = "\nSales Bar Chart\n(Each * = $100)\n";

        for (int store = 1; store <= storeAmount; store++) {
            System.out.print("Enter today's sales for store " + store + ": ");
            int sales = console.nextInt();

            chart += "Store " + store + ": ";
            for (int i = 0; i < sales / 100; i++) {
                chart += "*";
            }
            chart += "\n";
        }
        System.out.println(chart);
        console.close();
    }
}
