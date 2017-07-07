import java.io.*;
import java.util.*;
public class Repeatnumber{
  
  public static void main(String args[]){
    
    Scanner s=new Scanner(System.in);   
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {               
      for(int j=0;j<i;j++)
      {
        if(a[i]==a[j])
        {
          System.out.println(a[i]);
        }
      }
    } 
   }
}
