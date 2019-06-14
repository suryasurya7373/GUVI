import java.util.*;
public class Pattern5445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<2*n-1;i++){
			for(int j=0;j<2*n-1;j++){
				System.out.print(1+Math.min(Math.abs(n-i-1), Math.abs(n-j-1)));
			}
			System.out.println();

		}
	}

}
