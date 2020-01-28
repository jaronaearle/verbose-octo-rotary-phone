// Jaron Earle
package minmaxjaronearle;

import javax.swing.JOptionPane;

public class MinMaxJaronEarle
{

    public static void main(String[] args)
    {
        int min;
        int max; 
        int num;
        int answer;
        String numIn;
        
        
        numIn = JOptionPane.showInputDialog("Enter a number: ");
        num = Integer.parseInt(numIn);
                
        min = num;
        max = num;
     
        do 
        {
            answer = JOptionPane.showConfirmDialog(null, "Enter another number?");
            
            if (answer == JOptionPane.NO_OPTION) 
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
        } while (answer == JOptionPane.YES_OPTION);
        
 
        JOptionPane.showMessageDialog(null, "The min is: " + min + "\nThe max is: " + max);
    }
}
