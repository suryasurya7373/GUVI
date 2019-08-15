package Programs;
import java.util.*;
public class PalindromeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		String s=Integer.toString(n);
		StringBuffer sb=new StringBuffer(s);
		String s1=sb.reverse().toString();
		while(!s.equals(s1)){
			int n1=Integer.parseInt(s);
			int n2=Integer.parseInt(s1);
			int n3=n1+n2;
			String m1=Integer.toString(n3);
			StringBuffer sb2=new StringBuffer(m1);
			String m2=sb2.reverse().toString();
			s=m1;
			s1=m2;
			count++;
		}
		System.out.println(s1);
		System.out.println(count);
	}
}
