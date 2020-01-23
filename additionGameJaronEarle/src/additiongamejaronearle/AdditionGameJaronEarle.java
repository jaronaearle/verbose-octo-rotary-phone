// Jaron Earle
package additiongamejaronearle;

import java.util.Scanner;

public class AdditionGameJaronEarle
{

    public static void main(String[] args)
    {
        Scanner input;
        int numQuestions;
        int totalCorrect;
        int num1;
        int num2;
        int correctAns;
        int userAns;
        
        input = new Scanner(System.in);
        totalCorrect = 0;
        
        System.out.println("How many questions would you like?: ");
        numQuestions = input.nextInt();
        
        for (int i = 1; i <= numQuestions; i++) 
        {
            num1 = (int)(Math.random() * 41) + 10;
            num2 = (int)(Math.random() * 41) + 10;
            correctAns = num1 + num2; 
            
            System.out.println(num1 + " + " + num2 + " ?");
            
            userAns = input.nextInt();
            
            if (userAns == correctAns) 
            {
                System.out.println("Correct!");
                totalCorrect++;
            }
            else 
            {
                System.out.println("Incorrect! The answer is: " + correctAns);
            }
            System.out.println("You have answered " + totalCorrect + " out of " + numQuestions);
        }
    }
    
}
