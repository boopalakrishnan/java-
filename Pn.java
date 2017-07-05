import java.io.*;
import java.util.*;
import java.util.Scanner;

    public class Pn
{
  public static void main (String[] args)
  {   
    int num =0;
    //Empty String
    String  primeNumbers = "";
    int n,n1;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the interval 1:");
    n = s.nextInt();
    System.out.println("Enter the interval 2:");
    n1=s.nextInt();
    
    for (int i = n+1; i <n1; i++)         
    {           
      int counter=0;    
      for(num =i; num>=1; num--)
      {
        if(i%num==0)
        {
          counter = counter + 1;
        }
      }
      if (counter ==2)
      {
        //Appended the Prime number to the String
        primeNumbers = primeNumbers + i + " ";
      } 
    } 
    System.out.println("Prime numbers from "+n+" to "+n1+" are :");
    System.out.println(primeNumbers);
  }
}
