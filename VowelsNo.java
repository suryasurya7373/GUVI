import java.util.*;
public class VowelsNo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String n=sc.next();
	char ch[]=n.toCharArray();
   for(int i=0;i<ch.length;i++){
	if((n.charAt(i)=='a')||(n.charAt(i)=='e')||(n.charAt(i)=='i')||(n.charAt(i)=='o')||(n.charAt(i)=='u')){
		System.out.println("Vowel");	
	}else if(Character.isAlphabetic(ch[i])&&(!Character.isDigit(ch[i]))){
		System.out.println("constant");
	}else{
		System.out.println("invalid");
	}
	}
		
	}
	}

