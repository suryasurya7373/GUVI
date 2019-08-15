import java.util.*;
public class Encription {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s=str.toLowerCase(); //small
		char ch2[]=str.toCharArray(); //original caps & small
		String alp="abcdefghijklmnopqrstuvwxyz";
		String last=s.substring(s.length()-1);
		int n=alp.indexOf(last)+1;
		//System.out.println(n);
		String res="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length-1;i++){
			int index=alp.indexOf(ch[i])-n;
			if(index<0){
				index+=26;
			}
			res+=alp.charAt(index);
		}
		String k="";
		res=res+alp.charAt(n-1);
		char chs[]=res.toCharArray();// result
		for (int i = 0; i < ch2.length; i++) {
			if(Character.isUpperCase(ch2[i])){
				k+=Character.toUpperCase(chs[i]);
			}
			else{
				k+=chs[i];
			}
		}
		System.out.println(k);
		
	}

}
