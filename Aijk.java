import java.io.*;
import java.util.*;
public class Aijk{
  
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
      for(int j=0;j<n;j++)
      {
        for(int k=0;k<n;k++)
        {
            
          if(a[i]+a[j]==a[k])
          
          {
            System.out.println(a[i]+a[j]+a[k]);
        }
      }
      
      
    } 
      }
    
  }
}
   
