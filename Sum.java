import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Sum
 { 
     public static void main(String[] args) 
     { 
        int n,sum=0; 
        Scanner input=new Scanner(System.in); 
        System.out.print("Enter Number :"); 
        n=input.nextInt(); 
       for(int i=1;i<=n;i++)
{
sum=sum+i;
}
                 System.out.print("Sum of First " + n + " Numbers = "+sum); 
     } 
      
} 
