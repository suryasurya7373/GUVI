import java.util.*;
public class Water {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		if(w>100){
			System.out.println("Invalid");
		}else{
			if(w%2!=0){
				System.out.println("no");
			}
			else {
				System.out.println("yes");
			     int n=w/2;
			     if(n%2==0){
			    	 System.out.println(n+" "+n);
			     }
			     else{
			    	 int t1 =n-1;
			    	 int t2 = n+1;
			    	 System.out.println(t1+" "+t2);
			     }
			}
			
		}
	}

}
