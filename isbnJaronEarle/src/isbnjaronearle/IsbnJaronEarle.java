// Jaron Earle
package isbnjaronearle;

import javax.swing.JOptionPane;

public class IsbnJaronEarle
{
    
   // ( (1* d1) + (2 * d2) + (3 * d3) + (4 * d4) + (5 * d5) + (6 * d6) + (7 * d7) + (8 * d8) + (9 * d9) ) % 11
   // last num 1-10 where 10 = X
   // 013601267
    public static void main(String[] args)
    {
        String checkSumValue;
        String isbnStr;
        int answer; 
        int checkSum;
        int isbn, d1, d2, d3, d4, d5, d6, d7, d8, d9;
        
        do 
        {
            isbnStr = JOptionPane.showInputDialog("Enter the first 9 digits of the ISBN: ");
            
            if (isbnStr.length() < 9 || isbnStr.length() > 10)  
            {
                JOptionPane.showMessageDialog(null, "The ISBN you entered was not 9 digits in length");
            }
            else 
            {
                isbn = Integer.parseInt(isbnStr);
                
                d1 = isbn / 100000000;
                d2 = isbn / 10000000 % 10;
                d3 = isbn / 1000000 % 10;
                d4 = isbn / 100000 % 10;
                d5 = isbn / 10000 % 10;
                d6 = isbn / 1000 % 10;
                d7 = isbn / 100 % 10;
                d8 = isbn / 10 % 10;
                d9 = isbn % 10;
                
                checkSum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
                
                if (checkSum >= 10) 
                {
                    checkSumValue = "X";
                }
                else 
                {
                    checkSumValue = String.valueOf(checkSum);
                }
                
                JOptionPane.showMessageDialog(null, "The ISBN is: " + isbnStr + checkSumValue);
            }
            answer = JOptionPane.showConfirmDialog(null, "Enter another ISBN?");
            
        } while (answer != JOptionPane.NO_OPTION);
    }
}

