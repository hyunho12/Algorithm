package baekjun;
import java.util.Scanner;

public class Test2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		int size = String.valueOf(num).length();		
		int start = num - (9*size);
		
		for(int i=start;i<num;i++) {
			int n = i;
			int sum = 0;
			
			while(n!=0) {
				sum += n % 10;
				n = n / 10;
			}
			
			if(sum + i == num) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
