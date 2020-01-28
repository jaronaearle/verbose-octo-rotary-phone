// Jaron Earle
package minmaxjaronearle;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MinMaxJaronEarle
{

    public static void main(String[] args)
    {
        int min;
        int max; 
        int num;
        String answer;
        String numIn;
        
        
        numIn = JOptionPane.showInputDialog("Enter a number: ");
        num = Integer.parseInt(numIn);
                
        min = num;
        max = num;
     
        do 
        {
            answer = JOptionPane.showInputDialog("Enter another number? y/n: ");
            
            if (answer.equalsIgnoreCase("n")) 
            {
                break;
            }
            
            numIn = JOptionPane.showInputDialog("Enter a number: ");
            num = Integer.parseInt(numIn);
            
            if (num > max) 
            {
                max = num;
            }
            else if (num < min)
            {
                min = num;
            }
        } while (!answer.equalsIgnoreCase("n"));
        
 
        JOptionPane.showMessageDialog(null, "The min is: " + min + "\nThe max is: " + max);
    }
}
