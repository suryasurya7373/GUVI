import java.util.*;
public class Repitive_Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);	
		while(1<s.length()){
			int s1=0;
		for(int i=0;i<s.length();i++){
			s1+=Integer.valueOf(String.valueOf(s.charAt(i)));
		}
		s=String.valueOf(s1);
		}
		System.out.println(s);		
	}
}
