/*2. Write a Java method to check if a given number is power of 4*/

import java.util.Scanner;

public class PowerSecond
{
    public int power(int n)
    {
        if (n<0 || n==0)
            return 0;

        else if (n % 4 == 0)
            return 1;

        else
            return 0;
    }
    public static void main(String args[])
    {
        System.out.println("Enter The Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PowerSecond obj=new PowerSecond();
        int i=obj.power(num);
        if (i==0)
            System.out.println("Not power of 4");
        else
            System.out.println("Power of 4");
    }
}