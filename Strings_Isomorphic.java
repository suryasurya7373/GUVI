import java.util.*;
public class Strings_Isomorphic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		String s1=sc.nextLine().toLowerCase();
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		int count=0, count1=0;
		for(int i=0;i<ch.length-1;i++){
			if(ch[i]==ch[i+1]){
				count++;
			}
		}
		for(int i=0;i<ch1.length-1;i++){
			if(ch1[i]==ch1[i+1]){
				count1++;
			}
		}
		System.out.println((count==count)?"true":"false");
		sc.close();
	}

}
