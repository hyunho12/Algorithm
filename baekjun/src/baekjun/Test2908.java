package baekjun;
import java.util.Scanner;

public class Test2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		num1 = Integer.parseInt(new StringBuilder().append(num1).reverse().toString());
		num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());
		
		System.out.print(num1 > num2 ? num1 : num2);
	}
}
