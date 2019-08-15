import java.util.*;
public class Program_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine().toLowerCase();
			String let="abcdefghijklmnopqrstuvwxyz";
			String sp[]=s.split(" ");
			int res=0;
			for(int i=0;i<sp.length;i++){
				if(sp.length%2==0){
					for(int j=0;j<sp.length;j++){
						res+=Math.abs(let.indexOf(sp[j].charAt(0))-let.indexOf(sp[j].length()-1));
						System.out.println(res);
					}
				}
			}
			System.out.println(res);
		}
	}
