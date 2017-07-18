import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RemoveSpaces {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String s1=s.replaceAll("\\s+", " ");
		System.out.println(s1); 
	}
}
