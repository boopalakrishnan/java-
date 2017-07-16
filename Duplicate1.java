import java.io.*;
import java.util.*;
class Duplicate1
{
pubic static voi main(String args[]){
System.out.println("Enter the number of elements in the array:");
	int b=s.nextInt();
	int[] n=new int[b];
	System.out.println("Enter the elements in the array:");
	for(int i=0;i<n.length;i++)
	{
		n[i]=s.nextInt();
	}
Arrays.sort(n);
for(int i = 1; i <n.length; i++) {
    if(n[i] == n[i-1]) {
        System.out.println("Duplicate: " +n[i]);
    }
}
}
}
