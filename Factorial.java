import java.lang.*;
import java.io.*;
import java.util.*;
class Factorial
{
  public static void main(String[] args)throws IOException
  {               int i,fact=1;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
    for(i=1;i<=n;i++)
    {
        fact=fact*i;
     } 
    
    System.out.println("FACTORIAL OF GIVEN NO :"+fact);
    
  }
}
