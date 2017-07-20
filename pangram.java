import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pangram {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		//String s=first.replace(" ","");
		//String s1=s.toLowerCase();
		//System.out.println(s);   
	    String second="abcdefghijklmnopqrstuvwxyz";
		StringBuffer n=new StringBuffer(s1);
		StringBuffer s2=new StringBuffer(second);
		int a=n.length();
		int b=s2.length();
		loop: for(int i=0;i<a;i++)
		{ 
			 //System.out.println(i);
			  char c=n.charAt(i);
		//System.out.println(c);
			for(int j=0;j<b;j++)
			{
				char d=s2.charAt(j);
				if(c==d)
				{
					 ////k++;
					 n.deleteCharAt(i);
					 s2.deleteCharAt(j);
					//System.out.println(n +" " +s2);
					 a=n.length();
					 //m=a;
					 b=s2.length();
					i=0;
					 j=0;
					continue loop;
					
				}
						}	
//	System.out.println(k);
		}
	  
	  //System.out.println(b);
	  if(b==0)
	  {
		  System.out.println("pangram");
	  }
	  else
	  {
		 System.out.println("not pangram");
	  }
	}
	

}
