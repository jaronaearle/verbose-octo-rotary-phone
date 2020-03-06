// Jaron Earle
package assignmentfourarraysjaronearle;

import java.io.File;
import java.util.Scanner;

public class AssignmentFourArraysJaronEarle
{

    public static void main(String[] args) throws Exception
    {
        double gpa;
        double[] sGpa;
        String sNum;
        String[] sNums;
        Scanner gpaData;

        sNums = new String[1000];
        sGpa = new double[1000];
        gpaData = new Scanner(new File("studentdata.txt"));

        // adds student data to arrays
        for (int i = 0; gpaData.hasNext(); i++)
        {
            sNum = gpaData.next();
            gpa = gpaData.nextDouble();

            sNums[i] = sNum;
            sGpa[i] = gpa;
        }
        
        displayGpaCount(sGpa);
    }
    
    public static void displayGpaCount(double[] sGpa) 
    {
        int[] count;
        count = new int[8];
        
        for (int j = 0; j < count.length; j++) 
            {
                count[j] = 0;
            }
            
        for (int i = 0; i < sGpa.length; i++) 
        {
            if (sGpa[i] != 0) 
            {
                if (sGpa[i] < 0.5) 
                {
                    count[0] += 1;
                }
                else if (sGpa[i] >= 0.5 && sGpa[i] < 1.0) 
                {
                    count[1] += 1;
                }
                else if (sGpa[i] >= 1.0 && sGpa[i] < 1.5) 
                {
                    count[2] += 1;
                }
                else if (sGpa[i] >= 1.5 && sGpa[i] < 2.0) 
                {
                    count[3] += 1;
                }
                else if (sGpa[i] >= 2.0 && sGpa[i] < 2.5) 
                {
                    count[4] += 1;
                }
                else if (sGpa[i] >= 2.5 && sGpa[i] < 3.0) 
                {
                    count[5] += 1;
                }
                else if (sGpa[i] >= 3.0 && sGpa[i] < 3.5) 
                {
                    count[6] += 1;
                }
                else if (sGpa[i] >= 3.5 && sGpa[i] <= 4.0) 
                {
                    count[7] += 1;
                }      
            }
        }
        
        System.out.println("0 - 0.49 (" + count[0] + ")");
        System.out.println("0.5 - 0.99 (" + count[1] + ")");
        System.out.println("1.0 - 1.49 (" + count[2] + ")");
        System.out.println("1.50 - 1.99 (" + count[3] + ")");
        System.out.println("2.0 - 2.49 (" + count[4] + ")");
        System.out.println("2.50 - 2.99 (" + count[5] + ")");
        System.out.println("3.0 - 3.49 (" + count[6] + ")");
        System.out.println("3.5 - 4.0 (" + count[7] + ")");
    }
}

