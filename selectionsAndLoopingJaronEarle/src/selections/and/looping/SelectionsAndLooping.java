// Jaron Earle
package selections.and.looping;

import java.util.Scanner;

/*  This program inputs an ending number and displays all numbers between
 1 and the ending number that are evenly divisible by 3.
 */
public class SelectionsAndLooping
{

    public static void main(String[] args)
    {
        int n;
        int d;
        int count;
        int accumulator;
        Scanner input;

        input = new Scanner(System.in);

        // input the ending number
        System.out.println("Enter the ending number: ");
        n = input.nextInt();
        
        System.out.println("Enter the divisor: ");
        d = input.nextInt();
        
        accumulator = 0;
        count = 0;
        
        System.out.println("Below are all the numbers that are evenly divisible by " + d + " from 1 up to " + n);

        while (accumulator <= n)
        {
            if (count == d) 
            {
                System.out.print(accumulator + "  ");
                count = 0;
            }
            else if (count != d) 
            {
                accumulator++;
                count++;
            }            
        }
        System.out.println();
    }

}
