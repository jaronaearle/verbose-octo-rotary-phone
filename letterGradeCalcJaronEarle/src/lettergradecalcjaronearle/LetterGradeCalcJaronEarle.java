// Jaron Earle
package lettergradecalcjaronearle;

import java.util.Scanner;

public class LetterGradeCalcJaronEarle
{

    public static void main(String[] args)
    {
       Scanner input;
       String name;
       int id;
       char lg;
       double q1, q2;
       double e1, e2;
       double bestQ, bestE, rawPercent;
       
       input = new Scanner(System.in);
       
        System.out.println("Enter the student's name: ");
        name = input.nextLine();
        
        System.out.println("Enter the student's id number: ");
        id = input.nextInt();
        
        System.out.println("Enter the student's first quiz score: ");
        q1 = input.nextDouble();
        
        System.out.println("Enter the student's second quiz score: ");
        q2 = input.nextDouble();
        
        System.out.println("Enter the student's first exam score: ");
        e1 = input.nextDouble();
        
        System.out.println("Enter the student's second exam score: ");
        e2 = input.nextDouble();
        
        bestQ = max(q1, q2);
        bestE = max(e1, e2);
        
        rawPercent = computeRawPercentage(bestQ, bestE);
        
        lg = finalGrade(rawPercent);
        
        System.out.printf("Student: %s\nID: %d\nGrade: %s\n", name, id, lg);
    }
    
    public static char finalGrade(double percent) 
    {
        if (percent > 90)
        {
            return 'A';
        }
        else if (percent < 90 && percent > 80) 
        {
            return 'B';
        }
        else if (percent  < 80 && percent > 70) 
        {
            return 'C';
        }
        else if (percent < 70 && percent > 60) 
        {
            return 'D';
        }
        else 
        {
            return 'F';
        }
    }
    
    public static double computeRawPercentage(double quiz, double exam) 
    {
        return ((quiz * .4) + (exam * .6));
    }
    
    public static double max(double a, double b) 
    {
        return a > b ? a : b;
    }
    
}
