import java.util.*;
public class OtpGenerate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		long acnum=sc.nextLong();
		String acnum2=String.valueOf(acnum);
		String type=sc.next();
		String output="";
		if(name.length()>2){
			if(String.valueOf(acnum).length()==11){
				if(type.contains("savings")||type.contains("current")||type.contains("lone")){
					output+=type.substring(0,2);
					output+=acnum2.substring(0,1);
					String a=acnum2.substring(0,5);
					int sum=0;
					for(int i=0;i<a.length();i++){
						sum+=Integer.parseInt(String.valueOf(a.charAt(i)));
					}
					output+=String.valueOf((sum/10)+(sum%10));
					output+=name.substring(0,1);
					String b=acnum2.substring(5,10);
					int sum1=0;
					for(int i=0;i<b.length();i++){
						sum1+=Integer.parseInt(String.valueOf(b.charAt(i)));
					}
					output+=String.valueOf((sum1/10)+(sum1%10));
					output+=name.substring(name.length()-1);
					output+=acnum2.substring(acnum2.length()-1);
				}
			}
			else{
				System.err.println("please enter the name,acount no and acount type:");
		}
		}
			System.out.println(output);
	}
}
