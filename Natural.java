import java.util.*;
public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			count+=i;
	}
		System.out.println(count);
	}
}
