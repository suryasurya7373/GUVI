import java.util.*;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] strs = s.split("[A-Z]");
        System.out.println(strs.length);
	}

}
