// Jaron Earle
package calculatetipjaronearle;

import java.util.Scanner;

public class CalculateTipJaronEarle
{

    public static void main(String[] args)
    {
        Scanner input;
        double billAmount;
        double gratuityRate;
        double totalBill;
        double totalGratuity;
        
        input = new Scanner(System.in);
        
        System.out.println("Enter the total bill amount: ");
        billAmount = input.nextDouble();
        
        System.out.println("Enter the gratuity rate: ");
        gratuityRate = input.nextDouble();
        
        totalBill = billAmount + billAmount * (gratuityRate / 100);
        totalGratuity = totalBill - billAmount;
        
        System.out.printf("Gratuity: %.2f\n", totalGratuity);
        System.out.printf("Total bill: %.2f\n", totalBill);
    }
    
}
