import java.lang.*;
import java.io.*;
import java.util.*;
  

// Class of ReverseString
class ReverseString
{
  public static void main(String[] args)throws IOException
  {               int i,j;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
    String input = br.readLine();
    char temp;
    char[] c=input.toCharArray();
    char[] a=new char[c.length];
    for( i=c.length-1,j=0;i>=0&&j<c.length;i--,j++)
    {
     
        temp=c[i];
          c[i]=a[j];
          a[j]=temp;
      
     } 
    String s=new String(a);
    System.out.println(s);
    
  }
}
