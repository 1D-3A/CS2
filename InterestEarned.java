// Sean Fournier
// September 2nd, 2025
// Interest Calculator

package CS2;
import java.util.*;
public class InterestEarned {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the Interest Rate: ");
        double interestRate = console.nextDouble();
        while (interestRate < 0) {
            System.out.print("Interest Rate can't be negative. Please enter a valid number: ");
            interestRate = console.nextDouble();
        }
        double interestPercent = interestRate / 100;

        System.out.print("Enter the amount of Times Compounded: ");
        double timesCompounded = console.nextDouble();
        while (timesCompounded < 0) {
            System.out.print("Times Compounded can't be negative. Please enter a valid number: ");
            timesCompounded = console.nextDouble();
        }

        System.out.print("Enter the Principal Amount: $");
        double principalAmount = console.nextDouble();
        while (principalAmount < 0) {
            System.out.print("Principal Amount can't be negative. Please enter a valid number: ");
            principalAmount = console.nextDouble();
        }

        double totalAmount = principalAmount * Math.pow((1 + (interestPercent / timesCompounded)), timesCompounded);
        double interestEarned = totalAmount - principalAmount;
        
        System.out.printf("\nInterest Rate: %.2f%%", interestRate);
        System.out.printf("\nTimes Compounded: %.2f", timesCompounded);
        System.out.printf("\nPrincipal Amount: $%.2f", principalAmount);
        System.out.printf("\nInterest Earned: $%.2f", interestEarned);
        System.out.printf("\nTotal Amount: $%.2f", totalAmount);

        console.close();
    }
}