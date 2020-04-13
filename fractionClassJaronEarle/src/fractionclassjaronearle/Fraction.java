package fractionclassjaronearle;

public class Fraction
{

    private final int numerator;
    private final int denominator;

    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int num, int denom)
    {
        numerator = num;
        denominator = denom;
    }

    @Override
    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }

    public double getDecimal()
    {
        return this.numerator / this.denominator;
    }

    public void reduce()
    {
        int n, d;
        int div;
        
        div = gcd(this.numerator, this.denominator);
        
        n = this.numerator / div;
        
        d = this.denominator / div;
        
        System.out.println(n + "/" + d);
    }

    public String toMixed() // if w < 0, do not display 0 && fix negative number shit
    {
        int w, p;
        
        if (this.numerator > this.denominator) 
        {
            w = this.numerator / this.denominator;
            p = this.numerator % this.denominator;
            
            return w + " " + p + "/" + this.denominator;
        }
        
        return this.numerator + "/" + this.denominator;
    }
    
    static int gcd(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        }
        return gcd(b, a % b);
    }
}
