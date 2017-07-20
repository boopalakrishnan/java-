import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2 {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int n1,sum=0;
		String s=String.valueOf(a);
		int l=s.length();
int l1=l-1;
		if(a>9)
		{
			for(int i=0;i<l;i++)
			{
				
			n1=a%10;
			a=a/10;
		
			//System.out.println(n1);
		//	System.out.println(l1);
				sum=(int) (sum+Math.pow(n1,l1));
				//System.out.println((int)Math.pow(n1,l1));
				l1--;
			
			
	//System.out.println(sum);

			}
			System.out.println(sum);
	}

}
}
