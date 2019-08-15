import java.util.*;
public class NambiyarNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
String result="";
char ch[]=input1.toCharArray();
for(int i=0;i<ch.length;i++){
    int sum=Character.getNumericValue(ch[i]);
    int flag=0;
    if(sum%2==1){
        flag=0;
    }
    else if(sum%2==0){
        flag=1;
    }
    for(int j=i+1;sum%2!=flag&&j<ch.length;j++,i++){
        sum+=Character.getNumericValue(ch[j]);
    }
    result+=String.valueOf(sum);
    System.out.println(result);
}
//return 0;     
return (Integer.parseInt(result));
}
}
