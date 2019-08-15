package Programs;
import java.util.*;
public class Fibonocic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=0,b=1,c;
	System.out.print(a+" "+b);
	for(int i=2;i<n;i++){
		c=a+b;
		a=b;
		b=c;
		System.out.print(" "+ c+" ");

	}

}
	}


