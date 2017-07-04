import java.io.*;
import java.util.*;
public class PNZ
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>0)
{
System.out.println("the number is positive");
}
else if(n<0)
{
System.out.println("the number is negative");
}
else
{
System.out.println("the number is Zero");
}
}
}
