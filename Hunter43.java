import java.io.*;
import java.util.*;
public class Hunter43 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<String> list1=new ArrayList<String>();
		System.out.println("Enter the string");
		
		String s=br.readLine();
		int l=s.length();
		String[] str=s.split("[a-z]");
		for(String s1:str){
			try{
			Integer n=Integer.valueOf(s1);
			list.add(n);
			}catch(NumberFormatException ex){}
			}
		String str1[]=s.split("[0-9]");
		for(String s2:str1){
			if (!s2.isEmpty())
			list1.add(s2);
		}
		for(int i=0;i<list1.size();i++){
			int limit=list.get(i);
		for(int j=0;j<limit;j++){
		System.out.print(list1.get(i));
		}
		}
	}

	}
