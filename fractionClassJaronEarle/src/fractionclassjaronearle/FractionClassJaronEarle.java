// Jaron Earle
package fractionclassjaronearle;

public class FractionClassJaronEarle
{

    public static void main(String[] args)
    {        
        Fraction[] frac = 
                {
                    new Fraction(),
                    new Fraction(3, 9), 
                    new Fraction(12, 5),
                    new Fraction(12, -5),
                    new Fraction(-12, -5)
                };
        
        for (int i = 0; i < frac.length; i++) 
        {
            System.out.println(frac[i].toString());
            System.out.println(frac[i].getDecimal());
            frac[i].reduce();
            System.out.println(frac[i].toMixed());
            System.out.println("");
        }
    }
    
}
