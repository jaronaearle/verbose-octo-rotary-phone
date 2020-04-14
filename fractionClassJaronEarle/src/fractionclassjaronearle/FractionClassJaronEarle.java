// Jaron Earle
package fractionclassjaronearle;

import java.util.Scanner;

public class FractionClassJaronEarle
{
    public static void main(String[] args)
    {   
        int c;
        boolean q;
        Scanner inp; 
        
        q = true;
        inp = new Scanner(System.in);
        
        Fraction[] fracs = 
                {
                    new Fraction(),
                    new Fraction(3, 9), 
                    new Fraction(12, 5),
                    new Fraction(12, -5),
                    new Fraction(-12, -5),
                    new Fraction(-75, -45)
                };
       
       do 
       {
           System.out.println("Enter 1 to display fraction");
           System.out.println("Enter 2 to reduce the fraction");
           System.out.println("Enter 3 to display the fraction as a mixed number");
           System.out.println("Enter 4 to display the decimal version of the fraction");
           System.out.println("Enter 5 to quit: ");
           
           c = inp.nextInt();
           
           for (Fraction frac : fracs) 
           {
               switch(c) 
               {
                   case 1:
                       System.out.println(frac.toString());
                       System.out.println("");
                       break;
                   case 2:
                       frac.reduce();
                       break;
                   case 3:
                       System.out.println(frac.toMixed());
                       System.out.println("");
                       break;
                   case 4:
                       System.out.println(frac.getDecimal());
                       System.out.println("");
                       break;
                   case 5:
                       q = false;
                       break;
                   default:
                       System.out.println("Unrecognized input!");
                       break;
               }
           }
       } while (q);
    }
}
