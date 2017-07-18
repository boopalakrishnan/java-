import java.util.Scanner;

public class MyPrimeNumCheck {
 
    public boolean isPrimeNumber(int number){
         
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
        MyPrimeNumCheck mpc = new MyPrimeNumCheck();
        Scanner s=new Scanner(System.in);
        int a1=s.nextInt();
        int b=s.nextInt();
        if(mpc.isPrimeNumber(a1)==true&&mpc.isPrimeNumber(b)==true)
        {
        	System.out.println("Co-prime");
        }
        else
        {
        	System.out.println("Not Co-prime");
        }
    }
}
