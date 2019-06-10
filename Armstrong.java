import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
 int c=0;
while(n>0){
	 int a=n%10;
	 n=n/10;
	 c=c+(a*a*a);
 }
if(temp==c){
	System.out.println("yes");
}else{
	System.out.println("no");
}
	}

}
