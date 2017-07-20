import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number354 {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int n1,count=0;
		String s=String.valueOf(a);
		int l=s.length();
		int l1=l;
		if(a>9)
		{
			for(int i=0;i<l;i++)
			{
				int sum=1;
			n1=a%10;
			a=a/10;
			for(int j=1;j<=l1;j++)
			{
				sum=(n1*sum);
				
			}
			
	//System.out.println(sum);
	count=count+sum;
			}
			System.out.println(count);
	}

}
}
