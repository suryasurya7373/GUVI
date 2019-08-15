import java.util.*;
public class Int_to_Binary {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String n2=sc.next();
	String n1=Integer.toBinaryString(n);
	int n3=Integer.parseInt(n2,2);
	System.out.println(n1);
	System.out.println(n3);
	}

}
