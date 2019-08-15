import java.util.*;
public class Loop {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int n = s.nextInt();
		int temp = 0;
		for(int i = 0;i<n;i++)
		{	if(i==0)
			temp+=a+Math.pow(2, i)*b;
		else
		{
			temp+=Math.pow(2, i)*b;
		}	
			System.out.print(temp+" ");
		}
	}

}
