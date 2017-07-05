import java.io.*;
import java.util.*;
import java.util.Scanner;
class Power
{
  public static void main(String[] args) 
  {
    int n,p;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter any number : ");
    n = s.nextInt();
    System.out.println("Enter the power: ");
    p=s.nextInt();
    int result=1;
    
    if(n>=0&&p==0)
    {
      result=1;
    }
    else if(n==0&&p>=1)
    { 
      result=0;
    }
    else
    {
      for(int i=1;i<=p;i++)
       {
        result=result*n;
       }      
    }
    System.out.println(n+"^"+p+"="+result);
  }
}
