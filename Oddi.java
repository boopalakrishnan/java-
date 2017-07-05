import java.io.*;
import java.util.*;
import java.util.Scanner;
class Oddi
{
  public static void main(String[] args) 
  {
    int n,n1;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the interval 1:");
    n = s.nextInt();
    System.out.println("Enter the interval 2:");
    n1=s.nextInt();
    System.out.println("The odd numbers between the intervals are:");
    for(int i=n+1;i<n1;i++)
    {
      if(i%2!=0)
      {
        System.out.println(i);
      }
    }
  }
}
