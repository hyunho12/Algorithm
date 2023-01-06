package baekjun;
import java.util.Scanner;

public class Test1919 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String word1 = sc.next();
		String word2 = sc.next();
		int[] arr = new int[26];
		
		for(int i=0;i<word1.length();i++) {
			arr[word1.charAt(i)-'a']++;
		}
		for(int i=0;i<word2.length();i++) {
			arr[word2.charAt(i)-'a']--;
		}
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += Math.abs(arr[i]);
		}
		
		System.out.println(sum);
	}

}
