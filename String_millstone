import java.util.*;
public class String_millstone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		int sum1=0;
		int sum2=0;
		if(n>=11 && n<=99){
			sum2=n%10;
			sum1=n/10;
		}
		String split[]=s.split("\\s");
		String s1=split[sum1-1];
		String s2=split[sum2-1];		
		int n1=s1.length()/2;
		int n2=s2.length()/2;		
		String str=s1.substring(n1, s1.length());
		String str1=s1.substring(0,n1);
		StringBuffer x=new StringBuffer(str1);
		x.reverse();		
		String st=s2.substring(n2, s2.length());
		String st1=s2.substring(0,n2+1);
		StringBuffer x1=new StringBuffer(st1);
		x1.reverse();
		System.out.println(str+x+" "+st+x1);
		}

}
