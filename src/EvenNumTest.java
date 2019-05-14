/* 5. Write a boolean method called isEven() in a class called EvenNumTest, which takes an
int as input and returns true if the input is even. The signature of the method is as follows:
public static boolean isEven(int number) */

import java.util.Scanner;

public class EvenNumTest {
    public static boolean isEven(int number){
        if(number==0 || number<0)
            return false;
        else {
            int mod = number % 2;
            if (mod == 0)
                return true;
            else
                return false;
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(isEven(num))
            System.out.println("even number");
        else {
            System.out.println("odd number");
        }
    }
}
