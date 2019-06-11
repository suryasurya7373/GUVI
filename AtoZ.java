import java.util.*;
public class AtoZ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st="abcdefghijklmnopqrstuvwxyz";
		String s=sc.next();
		char ch=s.charAt(0);
		int n=st.indexOf(ch);
		System.out.println(st.charAt(25-n));
		
	}

}
