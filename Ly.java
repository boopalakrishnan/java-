import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Ly
{
    public static void main(String args[])
    {
       
       Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter the year : ");
        int year=scan.nextInt();
if(year%400==0 || year%100 ==0 || year%4==0)
{
	System.out.println("is a leap year");
}
else
{
	
	System.out.println("is not leap year");
}
    }
}
