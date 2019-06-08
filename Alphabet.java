import java.util.*;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
	char ch=sc.next().charAt(0);
	
		if(((ch>=65)&&(ch<=90))||((ch>=97)&&(ch<=122))){
			System.out.println(" Alphabet");
	}else{
		System.out.println("not Alphabet");
	}
}
	}
