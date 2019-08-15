import java.util.*;
public class Add_equal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int[n];			
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();			
		}
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			int b=a[i]+a[j];
			if(n2==b){
				count++;
				System.out.println(a[i]+","+a[j]);				
			}
		}			
		}
		if(count==0)
		{
			System.out.println("no");
		}
		
	}

}
