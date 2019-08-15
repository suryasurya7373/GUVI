package Programs;
import java.util.*;
public class Amazing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next(); 
		String s2=sc.next(); 
		String s3=sc.next();
		String s4=s1+s2;
		char ch[]=s4.toCharArray();
		Arrays.sort(ch);
		String c=new String(ch);			
		char ch4[]=s3.toCharArray(); 
		Arrays.sort(ch4);
		String h=new String(ch4);
		if(c.contains(h)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
	

	}


