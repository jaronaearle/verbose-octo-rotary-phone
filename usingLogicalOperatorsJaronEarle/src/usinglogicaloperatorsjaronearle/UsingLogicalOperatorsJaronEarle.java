// Jaron Earle
package usinglogicaloperatorsjaronearle;

import java.util.Scanner;

public class UsingLogicalOperatorsJaronEarle
{

    public static void main(String[] args)
    {
        Scanner input;
        int num;

        input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        num = input.nextInt();

        if (num % 5 == 0) 
        {
            System.out.println("Number is divisble by 5");
        }
        if (num % 6 == 0) 
        {
            System.out.println("Number is divisble by 6");
        }
        if (num % 5 == 0 && num % 6 == 0)
        {
            System.out.println("Number is divisible by both 5 AND 6");
        }
        if (num % 5 == 0 && num % 6 != 0) 
        {
            System.out.println("Number is divisble by 5 and NOT by 6");
        }
        if (num % 5 != 0 && num % 6 == 0)
        {
            System.out.println("Number is divisble by 6 and NOT by 5");
        }
        else if (num % 5 != 0 && num % 6 != 0) 
        {
            System.out.println("Number is not divisible by 5 or 6");
        }
    }

}
