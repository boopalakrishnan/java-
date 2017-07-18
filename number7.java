import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class number7 {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] n1=new int[n];
		for(int i=0;i<n;i++)
		{
			n1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter a number : ");
		int a=Integer.parseInt(br.readLine());
		for(int i=a;i<n;i++)
		{
			System.out.print(n1[i]);
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(n1[i]);
		}
	}
}
