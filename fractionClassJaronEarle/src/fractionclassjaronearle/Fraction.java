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
        numerator = num;
        denominator = denom;
    }
    
    public String toString() 
    {
        return  this.numerator + "/" + this.denominator;
    }
    
    public double getDecimal() 
    {
        return this.numerator / this.denominator;
    }
    
    public void reduce() 
    {
        System.out.println("reduce me!");
    }
    
    public String toMixed() 
    {
        return "return here";
    }
}
