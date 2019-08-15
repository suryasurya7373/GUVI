import java.util.*;
public class Rev_Str_space {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		String rev=String.valueOf(sb.reverse());
		String rev1=rev.replaceAll(" ", "");			
		char ch[]=s.toCharArray();
		char ch1[]=rev1.toCharArray();
		String out="";
		for(int i=0,j=0;i<ch.length&&j<ch1.length;i++){
			if(ch[i]!=' '){
				out+=ch1[j];
				j++;
			}else{
				out+=" ";
			}
		}
		//input:JAVA JSP ANDROID
		//output:DIOR DNA PSJAVAJ
		System.out.println(out);
	}
}
