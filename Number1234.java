import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1234 {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int n1,sum=0,count=0;
		String s=String.valueOf(a);
		int l=s.length();
		if(a>9)
		{
			for(int i=0;i<l;i++)
			{
				for(int j=0;j<l;j++)
				{
					n1=a%10;
					a=a/10;
					sum=sum+n1;
					//System.out.println(n1);
					
				}
				l--;
				count=count+sum;
			}
			System.out.println(count);
		}
	}

}
