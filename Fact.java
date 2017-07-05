import java.io.*;
import java.util.*;
public class Fact
{
  public static void main(String args[])
  {
    int fact=1;
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    
    for(int i=1;i<=a;i++)
    {
      fact=fact*i;
    }
    System.out.println(fact);
  }
}
