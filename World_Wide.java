import java.util.*;
public class World_Wide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		String apl="abcdefghijklmnopqrstuvwxyz",out1="";
		String w[]=s.split(" ");
		int res=0;
		int a=0;
		for (int i = 0; i <w.length; i++) {
			if(w[i].length()%2==0) {
				for (int j = 0; j <w[i].length()/2; j++) {
					res+=(int)(Math.abs(apl.indexOf(w[i].charAt(j))-apl.indexOf(w[i].charAt(w[i].length()-1-j))));
				}
			}
			else {
				int d=w[i].length()/2+1;
				for (int k = 0; k < d; k++) {
					res+=(int)Math.abs(apl.indexOf(w[i].charAt(k))-apl.indexOf(w[i].charAt(w[i].length()-1-k)));
					if(k==d-1) {
						a=Math.abs(apl.indexOf(w[i].charAt(w[i].length()/2)+1));
					}
				}
				res=res+a;
			}	
			out1+=res;
			res=0;a=0;
		}
		int result=Integer.valueOf(out1);
		System.out.println(result);
		sc.close();
	}
}
