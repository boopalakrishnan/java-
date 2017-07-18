import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleString {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		//String s=first.replace(" ","");
		//String s1=s.toLowerCase();
		//System.out.println(s);   
	   // String second=s1;
		StringBuffer n=new StringBuffer(s1);
		//StringBuffer s2=new StringBuffer(second);
		int a=n.length();
		//int b=s2.length();
		loop: for(int i=0;i<a;i++)
		{ 
		//	System.out.println(i);
			  char c=n.charAt(i);
		//System.out.println("i"+c);
			for(int j=1;j<a;j++)
			{
				char d=n.charAt(j);
			//	System.out.println("j"+d);
				if(c==d)
				{
					 ////k++;
					 n.deleteCharAt(i);
					//System.out.println(n);
					 n.deleteCharAt(j-1);
					//System.out.println(n);
					 a=n.length();
					 i=0;
					 //m=a;
					// b=s2.length();
					
					j=0;
					continue loop;
					
				}
						}	
//	System.out.println(k);
		}
	  
	  //System.out.println(b);
	  if(a==0)
	  {
		  System.out.println("Double String");
	  }
	  else
	  {
		 System.out.println("NOT A DOUBLE STRING");
	  }
	}
	

}
