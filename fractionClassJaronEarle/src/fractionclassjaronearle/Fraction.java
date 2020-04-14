package fractionclassjaronearle;

public class Fraction
{

    private int numerator;
    private int denominator;

    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int num, int denom)
    {
        if (denom < 0) 
        {
            num *= -1;
            denom *= -1;
        }
        
        this.numerator = num;
        this.denominator = denom;
    }

    @Override
    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }

    public double getDecimal()
    {
        return (double)this.numerator / this.denominator;
    }

    public void reduce()
    {
        int div;
        
        div = gcd(this.numerator, this.denominator);
        
        this.numerator = this.numerator / div;
        
        this.denominator = this.denominator / div;
    }

    public String toMixed() 
    {
        int w, p;
        
        if (Math.abs(this.numerator) > this.denominator) 
        {
            w = this.numerator / this.denominator;
            p = this.numerator % this.denominator;
            
            return w < 0 ?
                    w + " " + -p + "/" + this.denominator :
                    w + " " + p + "/" + this.denominator; 
        }
        
        return this.numerator + "/" + this.denominator;
    }
    
    static int gcd(int a, int b) 
    {
        return b == 0 ? a : gcd(b, a % b);
    }
}
