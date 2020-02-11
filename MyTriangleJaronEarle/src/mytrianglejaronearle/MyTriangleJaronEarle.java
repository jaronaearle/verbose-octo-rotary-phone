// Jaron Earle
package mytrianglejaronearle;

import java.util.Scanner;

public class MyTriangleJaronEarle
{

    public static void main(String[] args)
    {
        Scanner input;
        double a, b, c;
        boolean triangle;
        
        input = new Scanner(System.in);
        
        System.out.println("Enter the first side length of your triangle: ");
        a = input.nextDouble();
        
        System.out.println("Enter the second side length of your triangle: ");
        b = input.nextDouble();
        
        System.out.println("Enter the third side length of your triangle: ");
        c = input.nextDouble();
        
        triangle = isValid(a, b, c);
        
        if (triangle) 
        {
            double area;
            String type;
            
            area = area(a, b, c);
            type = triangleType(a, b, c);
            
            System.out.printf("Your triangle is a %s triangle with area %.3f\n", type, area); // displays area to 3 decimals
        }
        else
        {
            System.out.println("Your triangle is not a valid triangle");
        }
        
    }

    public static boolean isValid(double a, double b, double c)
    {
        double[] triangle;
        triangle = sortSides(a, b, c);
        
        return triangle[0] + triangle[1] > triangle[2] ? true : false;
    }

    public static double area(double a, double b, double c)
    {
        double s, area;
        double[] triangle;
        triangle = sortSides(a, b, c);
        
        s = (triangle[0] + triangle[1] + triangle[2]) / 2;
                
        area = Math.sqrt(s * (s - triangle[0]) * (s - triangle[1]) * (s -triangle[2]));
        
        return area;
    }

    public static String triangleType(double a, double b, double c)
    {
        double[] triangle;
        triangle = sortSides(a, b, c);
        
        if (triangle[0] + triangle[1] <= triangle[2])
        {
            return "Invalid";
        }
        else if (triangle[0] == triangle[2])
        {
            return "Equalateral";
        }
        else if (triangle[0] == triangle[1] || triangle[1] == triangle[2])
        {
            return "Isosceles";
        } 
        
        return "Scalene";
    }

    public static double[] sortSides(double a, double b, double c)
    {
        double temp;
        double[] sorted;

        if (a > b)
        {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c)
        {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b)
        {
            temp = a;
            a = b;
            b = temp;
        }

        sorted = new double[3];
        sorted[0] = a;
        sorted[1] = b;
        sorted[2] = c;

        return sorted; // returns the sides of the triangle sorted in ascending order
    }
}
