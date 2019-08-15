package Programs;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		while(v-->0){
			int n=sc.nextInt();
			int s=n;
			int sum=0;
		while(n>0){
			int m=n%10;
			int fact=1;
			for(int i=1;i<=m;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==s){
			System.out.println("Strong");
		}
		else{
			System.out.println("not strong");
		}
	}
	}
}
