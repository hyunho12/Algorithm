package baekjun;
import java.util.Scanner;

public class Test2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int tmp = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if(sum <= m && tmp < sum) {
						tmp = sum;
					}
					
				}
			}
		}
		System.out.println(tmp);
	}

}
