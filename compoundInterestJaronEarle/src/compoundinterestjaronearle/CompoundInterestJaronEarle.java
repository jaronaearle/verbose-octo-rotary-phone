// Jaron Earle
package compoundinterestjaronearle;

import javax.swing.JOptionPane;

public class CompoundInterestJaronEarle
{

    public static void main(String[] args)
    {
        String monthlySavingInput;
        String annualInterestInput;
        double monthlySaving;
        double annualInterest;
        double monthlyInterest;
        double totalSavings; 
        
        monthlySavingInput = JOptionPane.showInputDialog("How much do you save each month?: ");
        
        annualInterestInput = JOptionPane.showInputDialog("What is the annual interest rate?: ");
        
        monthlySaving = Double.parseDouble(monthlySavingInput);
        
        annualInterest = Double.parseDouble(annualInterestInput);
        
        monthlyInterest = ((annualInterest / 100) / 12);
        
        totalSavings = 0;
        
        for (int i = 0; i < 6; i++) 
        {
            totalSavings = (totalSavings + monthlySaving) * (1 + monthlyInterest);
        }
                
        JOptionPane.showMessageDialog(null, String.format("You've saved: $%.2f over the last 6 months!", totalSavings));
    }
    
}
