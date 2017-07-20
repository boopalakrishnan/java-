import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Namemaxmark
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String[]> l=new ArrayList<String[]>();
		System.out.println("Enter the number of strings");
		int n=Integer.parseInt(br.readLine());
		String[] s=new String[n];
		String[] b=new String[2];
		int max=0;
		System.out.println("Enter the Strings");
		for(int i=0;i<n;i++)
		{
			s[i]=br.readLine();
		}
		for(int i=0;i<n;i++)
		{int sum=0;
			String[] s1=s[i].split("#");
			String[] s2=new String[2];
			for(int j=1;j<s1.length;j++)
			{
				int n1=Integer.parseInt(s1[j]);
				sum=sum+n1;
			}
			s2[0]=s1[0];
			s2[1]=String.valueOf(sum);
			l.add(s2);
			
		}
		for (int i = 0; i < l.size(); i++) {
			String[] a = l.get(i);
			for(int j=0;j<a.length;j++)
			{
				int a1=Integer.parseInt(a[1]);
				if(a1>max)
				{
					max=a1;
					b[0]=a[0];
				}
				
			}
		}
		System.out.print(b[0]);
		
	}
}
