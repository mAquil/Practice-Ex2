/* 6. Write a program, which reads number of students and n grades as input (of int between
0 and 100, inclusive) and displays the average, minimum and maximum.Your program
shall check for valid input. You should keep all the grades in an int[] and use a method for
each of the computations.

Output:
Enter the number of students: 4
Enter the grade for student 1: 86
Enter the grade for student 2: 65
Enter the grade for student 3: 98
Enter the grade for student 4: 77
The average is 81.50
The minimum is 65
The maximum is 98 */

import java.util.Scanner;
import java.util.Arrays;
public class Students {
    public static void main(String [] args) {
        System.out.println("enter number of students");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int b[] = new int[n];
        Students obj1=new Students();
        if(n>100 && n<0)
        {
            System.out.println("please enter number bteween 0 to 100");
        }
        else {

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the grade for student " +i+ " :");
                b[i] = obj.nextInt();
            }
            double average = obj1.avg(b);
            System.out.println("average of " + n + " students is " + average);
            int minimum = obj1.min(b);
            System.out.println("minimum num is " + minimum);
            int maximum = obj1.max(b);
            System.out.println("minimum num is " + maximum);
        }
    }

    public double avg( int a[]) {
        int sum = 0;
        int l = a.length;
        for (int i = 0; i < l; i++) {
            System.out.println("grade of student "+ (i+1)+ "is" +a[i]);
            sum += a[i];
        }
        int avg1=sum/l;
        return avg1;
    }
    public int min( int a[])
    {
        Arrays.sort(a);
        return a[0];
    }
    public int max( int a[])
    {   int l1 = a.length;
        Arrays.sort(a);
        return a[l1-1];
    }

}