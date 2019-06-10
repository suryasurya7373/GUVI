import java.util.*;
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String str=sb.toString();
		if(s.equals(str)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
