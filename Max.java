import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Max
{
    public static void main(String args[])
    {
        int max;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter three numbers : ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
		
        if(a>b&&a>c)
        {
            max=a;
        }
        else if(b>a&&b>c)
        {
         max=b;
        }
else
{
max=c;
}
System.out.println("the maximun value is: "+max);
    }
}
