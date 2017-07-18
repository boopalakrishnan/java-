import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseWords {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		 String[] s1=s.split(" ");
		 String[] s2=new String[s1.length];
		 for(int i=0,j=s1.length-1;i<s1.length&&j>=0;i++,j--)
		 {
			 s2[i]=s1[j];
			// System.out.println(s2[i]);
		 }
		 for(int i=0;i<s2.length;i++)
		 {
			 System.out.print(s2[i]+" ");
		 }
		 
	}

}
