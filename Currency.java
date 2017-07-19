

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Currency
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Amount");
		int n=Integer.parseInt(br.readLine());
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(n>500)
			{
				n=n-500;
				count=count+1;
			}
			else
				break;
		}
		for(int i=0;i<n;i++)
		{
			if(n>100)
			{
				n=n-100;
				count=count+1;
			}
			else
				break;
		}
		for(int i=0;i<n;i++)
		{
			if(n>50)
			{
				n=n-50;
				count=count+1;
			}
			else
				break;
		}
		for(int i=0;i<n;i++)
		{
			if(n>10)
			{
				n=n-10;
				count=count+1;
			}
			else
				break;
		}
		System.out.println("No of currency notes : "+(count+n));
		
	}
}
