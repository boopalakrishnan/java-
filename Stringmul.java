import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Stringmul {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String s1=br.readLine();
		int n=Integer.parseInt(s);
		int n1=Integer.parseInt(s1);
		int mul=n*n1;
		String ans=String.valueOf(mul);
		System.out.println(ans);
	}
}
