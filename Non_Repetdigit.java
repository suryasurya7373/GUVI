import java.util.*;
public class Non_Repetdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		char [] c = s.toCharArray();
		int count=0;
		for(int i=0;i<s.length()-1;i++){
			for(int j=i+1;j<=s.length()-1;j++){
				if(c[i]==c[j]){
					//c[i] ='*';
					c[j] = '*';					
				}				
			}
		}
		for(char h:c)
		{
			if(h!='*')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
