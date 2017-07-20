import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Remove
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements");
		int n=Integer.parseInt(br.readLine());
		int n1[]=new int[n];
		int j=0;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			n1[i]=Integer.parseInt(br.readLine());
		}
		int[] n2=new int[n];
		System.out.println("Enter the element to be removed");
		int r=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			if(n1[i]!=r)
			{
				n2[j]=n1[i];
				j++;
			}
		}
	for(int i=0;i<n2.length;i++)
	{ if(n2[i]>0)
	{
		System.out.print(n2[i]+" ");
	}
	}
		
		
	}
}
