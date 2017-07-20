import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engineering {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int k=0;
		char[] c=s.toCharArray();
		int l=s.length();
		char[] c1=new char[l];
		for(int i=0;i<l;i++)
		{int count=0;
			for(int j=0;j<l;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					
				}
			}
			if(count==1)
			{
				c1[k]=c[i];
				k++;
			}
		}
		String s1=String.valueOf(c1);
		System.out.println(s1);
	}
}
