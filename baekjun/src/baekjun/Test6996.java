package baekjun;
import java.util.Arrays;
import java.util.Scanner;

public class Test6996 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			String word1 = sc.next();
			String word2 = sc.next();
			
			isAngram(word1,word2);
		}
	}
	
	public static void isAngram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println(str1 +" & "+ str2 + "are anagrams.");
		}
		else {
			System.out.println(str1 +" & "+ str2 + "are NOT anagrams.");
		}
	}

}
