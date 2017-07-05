import java.io.*;
import java.util.*;
public class Vc
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String c =br.readLine();
    if(c.equals("a")||c.equals("e")||c.equals("i")||c.equals("o")||c.equals("u")||c.equals("A")||c.equals("E")||c.equals("I")||c.equals("O")||c.equals("U"))
    {
      System.out.println("Vowel");
    }
    else
    {
      System.out.println("Consonant");
    }
  }
}
