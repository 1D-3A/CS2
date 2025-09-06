// Sean Fournier
// September 2nd, 2025
// Box Office Calculation

package CS2;
import java.util.*;
public class BoxOffice {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the Movie Name: ");
        String movieName = console.nextLine();

        System.out.print("Enter the amount of Adult Tickets Sold: ");
        double adultTickets = console.nextDouble();
        while (adultTickets < 0) {
            System.out.print("Number of tickets sold can't be negative. Please enter a valid number: ");
            adultTickets = console.nextDouble();
        }

        System.out.print("Enter the amount of Children's Tickets Sold: ");
        double childTickets = console.nextDouble();
        while (childTickets < 0) {
            System.out.print("Number of tickets sold cannot be negative. Please enter a valid number: ");
            childTickets = console.nextDouble();
        }

        double adultTotal = adultTickets * 10;
        double childTotal = childTickets * 6;
        double grossBox = adultTotal + childTotal;
        double netBox = grossBox * .2;
        double paidToDistributor = grossBox - netBox;

        System.out.printf("\nMovie Name: %s", movieName);
        System.out.printf("\nAdult Tickets Sold: %.2f", adultTickets);
        System.out.printf("\nChild Tickets Sold: %.2f", childTickets);
        System.out.printf("\nGross Box Office Total: $%.2f", grossBox);
        System.out.printf("\nNet Box Office Total: $%.2f", netBox);
        System.out.printf("\nAmount paid to Distributor: $%.2f", paidToDistributor);

        console.close();
    }
    
}
