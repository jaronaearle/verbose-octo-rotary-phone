// Jaron Earle
package assignmentfourarraysjaronearle;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class AssignmentFourArraysJaronEarle
{

    public static void main(String[] args) throws Exception
    {
        double gpa;
        double[] sGpa;
        String sNum;
        String[] sNums;
        Scanner gpaData;

        sNums = new String[1000];
        sGpa = new double[1000];
        gpaData = new Scanner(new File("studentdata.txt"));

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
                }
                else if (sGpa[i] >= 0.5 && sGpa[i] < 1.0) 
                {
                    count[1] += 1;
                }
                else if (sGpa[i] >= 1.0 && sGpa[i] < 1.5) 
                {
                    count[2] += 1;
                }
                else if (sGpa[i] >= 1.5 && sGpa[i] < 2.0) 
                {
                    count[3] += 1;
                }
                else if (sGpa[i] >= 2.0 && sGpa[i] < 2.5) 
                {
                    count[4] += 1;
                }
                else if (sGpa[i] >= 2.5 && sGpa[i] < 3.0) 
                {
                    count[5] += 1;
                }
                else if (sGpa[i] >= 3.0 && sGpa[i] < 3.5) 
                {
                    count[6] += 1;
                }
                else if (sGpa[i] >= 3.5 && sGpa[i] <= 4.0) 
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

        for (int i = 0; i < count.length && i < stars.length; i++)
        {
            System.out.println("0 - 0.49 (" + count[i] + ") " + stars[i]);
        }
        System.out.println("");
    }

    public static void displayClassRank(String[] sNums, double[] sGpa)
    {
        double[] gpaForRank = new double[1000];
        int[] ties = new int[1000];
        int[] ranks = new int[1000];

        for (int i = 0; i < sGpa.length; i++)
        {
            for (int j = 0; j < sGpa.length; j++)
            {
                if (sGpa[i] == sGpa[j])
                {
                    ties[i]++;
                }
            }
        }

        System.arraycopy(sGpa, 0, gpaForRank, 0, gpaForRank.length);

        Arrays.sort(gpaForRank);

        gpaForRank = reverse(gpaForRank);

        for (int i = 0; i < sGpa.length; i++)
        {
            for (int j = 0; j < gpaForRank.length; j++)
            {
                if (sGpa[i] == gpaForRank[j])
                {
                    ranks[i] = j + 1;
                    break;
                }
            }
        }

        for (int i = 0; i < sNums.length; i++)
        {
            if (sNums[i] != null && sGpa[i] > 0)
            {
                System.out.print(sNums[i] + "\t" + sGpa[i] + "\t");
                if (ties[i] > 1)
                {
                    System.out.print("T");
                    System.out.print(ranks[i]);
                    System.out.println(" with " + ties[i] + " others.");
                }
                else 
                {
                    System.out.println(ranks[i]);
                }
            }
        }
    }

    public static double[] reverse(double[] arr)
    {
        for (int i = 0; i < arr.length / 2; i++)
        {
            double temp = arr[i];

            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        return arr;
    }
}
