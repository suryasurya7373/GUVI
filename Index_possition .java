import java.util.*;
public class Index_possition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="abcdefghijklmnopqrstuvwxyz";
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int m=sc.nextInt();
		String m1=String.valueOf(s.charAt(m-1));
		int n1=0;
		int n2=0;
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++){
			n1+=s.indexOf(ch[i])+1;
		}
		char ch1[]=s2.toCharArray();
		for(int i=0;i<ch1.length;i++){
			n2+=s.indexOf(ch1[i])+1;
		}
		int n=n1/n2;
		System.err.println(n);		
		System.out.println(n1);
		System.out.println(n2);	
		System.out.println(m1);
	}
}
