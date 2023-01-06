package baekjun;

import java.util.Scanner;

public class Test2606 {
	static int answer = 0;
	static boolean[][] maps;
	static boolean[] visited;
	static int comNum,pairNum;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		comNum = sc.nextInt();
		pairNum = sc.nextInt();
		
		maps = new boolean[comNum+1][comNum+1];
		visited = new boolean[comNum+1];
				
		int n,m;
		for(int i = 0; i < pairNum;i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			maps[n][m] = true;
			maps[m][n] = true;			
		}
		dfs(1);
		System.out.println(answer - 1);
	}
	
	public static void dfs(int idx) {
		visited[idx] = true;
		answer++;
		for(int i=1; i<=comNum; i++) {
			if(!visited[i] && maps[idx][i] == true) {
				dfs(i);
			}
		}
	}
}
