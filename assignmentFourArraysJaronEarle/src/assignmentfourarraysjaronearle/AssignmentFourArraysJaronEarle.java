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
        
        while (gpaData.hasNext()) 
        {
            int index = 0;
           
            sNum = gpaData.next();
            gpa = gpaData.nextDouble();
            
            System.out.println("Fresh of the press " + sNum + "\t" + gpa);
            
            sNums[index] = sNum;
            sGpa[index] = gpa;
            
            System.out.println("From the array " + sNums[index] + "\t" + sGpa[index]);
            
            index++;
        }
        
//        for (int i = 0; i < sNums.length; i++) 
//        {
//            System.out.println(sNums[i] + "\t" + sGpa[i]);
//        }

    }
    
}
