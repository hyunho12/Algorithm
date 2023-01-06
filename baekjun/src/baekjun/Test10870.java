package baekjun;
import java.util.*;

public class Test10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				
		System.out.println(finbonaci(num));
	}
	
	public static int finbonaci(int num) {
		int ans=0;
		if(num<=1) {
			return num;
		}
		return finbonaci(num-1) + finbonaci(num-2);
	}

}
