import java.util.*;
public class ArrayInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			sum+=a[i];
		}
System.out.println(sum);
	}

}
