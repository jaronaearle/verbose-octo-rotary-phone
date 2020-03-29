// Jaron Earle
package assignmentfourarraysjaronearle;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class AssignmentFourArraysJaronEarle
{
    public static int length = 20; // set for size of file

    public static void main(String[] args) throws Exception
    {
	double gpa;
	double[] sGpa;
	String sNum;
	String[] sNums;
	Scanner gpaData;
	sNums = new String[length];
	sGpa = new double[length];

//      gpaData = new Scanner(new File("studentdata.txt")); ACTUAL DATA
	gpaData = new Scanner(new File("smalldata.txt")); // SMALL TEST DATA SET

	// adds student data to arrays
	for (int i = 0; gpaData.hasNext(); i++)
	{
	    sNum = gpaData.next();
	    gpa = gpaData.nextDouble();

	    sNums[i] = sNum;
	    sGpa[i] = gpa;
	}

	displayGpaCount(sGpa);
	displayClassRank(sNums, sGpa);
    }

    public static void displayGpaCount(double[] sGpa)
    {
	int[] count;
	String[] stars;

	count = new int[8];
	stars = new String[8];

	for (int i = 0; i < count.length; i++)
	{
	    count[i] = 0;
	}

	for (int i = 0; i < sGpa.length; i++)
	{
	    if (sGpa[i] != 0)
	    {
		if (sGpa[i] < 0.5)
		{
		    count[0] += 1;
		} else if (sGpa[i] >= 0.5 && sGpa[i] < 1.0)
		{
		    count[1] += 1;
		} else if (sGpa[i] >= 1.0 && sGpa[i] < 1.5)
		{
		    count[2] += 1;
		} else if (sGpa[i] >= 1.5 && sGpa[i] < 2.0)
		{
		    count[3] += 1;
		} else if (sGpa[i] >= 2.0 && sGpa[i] < 2.5)
		{
		    count[4] += 1;
		} else if (sGpa[i] >= 2.5 && sGpa[i] < 3.0)
		{
		    count[5] += 1;
		} else if (sGpa[i] >= 3.0 && sGpa[i] < 3.5)
		{
		    count[6] += 1;
		} else if (sGpa[i] >= 3.5 && sGpa[i] <= 4.0)
		{
		    count[7] += 1;
		}
	    }
	}

	for (int i = 0; i < count.length; i++)
	{
	    int num;
	    StringBuilder s;

	    num = count[i];
	    s = new StringBuilder();

	    if (num % 10 > 5)
	    {
		num = num + (10 - (num % 10));
	    } else
	    {
		num = num - (num % 10);
	    }

	    for (int j = 0; j < num; j += 10)
	    {
		s.append("*");
	    }

	    stars[i] = s.toString();
	}

	//add loop, ie store quantities as strings in output array
	System.out.println("0 - 0.49 (" + count[0] + ") " + stars[0]);
	System.out.println("0.5 - 0.99 (" + count[1] + ") " + stars[1]);
	System.out.println("1.0 - 1.49 (" + count[2] + ") " + stars[2]);
	System.out.println("1.50 - 1.99 (" + count[3] + ") " + stars[3]);
	System.out.println("2.0 - 2.49 (" + count[4] + ") " + stars[4]);
	System.out.println("2.50 - 2.99 (" + count[5] + ") " + stars[5]);
	System.out.println("3.0 - 3.49 (" + count[6] + ") " + stars[6]);
	System.out.println("3.5 - 4.0 (" + count[7] + ") " + stars[7]);
	System.out.println("");
    }

    public static void displayClassRank(String[] sNums, double[] sGpa)
    {
	int r;
	double[] GPAforRank = new double[length];
	int[] ties = new int[length];
	int[] ranks = new int[length];

	// calculate ties
	for (int i = 0; i < length; i++)
	{

	    for (int j = 0; j < length; j++)
	    {
		if (sGpa[i] == sGpa[j])
		{
		    ties[i]++;
		}
	    }

	}

	// create new array for other shit
	for (int i = 0; i < length; i++)
	{
	    GPAforRank[i] = sGpa[i];
	}

	// sort copied array
	Arrays.sort(GPAforRank);
	//need to actual reverse order

	// compare original array against all of sorted array,
	// when they match store the sorted arrays index as the "rank"
	for (int i = 0; i < length; i++)
	{
	    for (int j = 0; j < length; j++)
	    {
		if (sGpa[i] == GPAforRank[j])
		{
		    ranks[i] = j + 1;
		    break;
		}
	    }
	}

	// sloppy print loop
	for (int i = 0; i < length; i++)
	{

	    System.out.print(sNums[i] + "\t" + sGpa[i] + "\t");
	    if (ties[i] > 1)
		System.out.print("T");
	    System.out.println(ranks[i]);
	}

    }
}
