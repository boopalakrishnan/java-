import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Startwith10
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of strings");
		int n=Integer.parseInt(br.readLine());
		String[] s=new String[n];
		int count=0;
		System.out.println("Enter the Strings");
		for(int i=0;i<n;i++)
		{
			s[i]=br.readLine();
		}
		for(int i=0;i<n;i++)
		{
			if(s[i].length()>2)
			{
				if(s[i].startsWith("10")||s[i].startsWith("01"))
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}
