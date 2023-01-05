package baekjun;

import java.util.*;

public class Test1012 {
	static int t;
	static int m,n,k;
	static int [][] maps;
	static boolean [][] visited;
	static int [] dr = {-1,1,0,0};
	static int [] dc = {0,0,-1,1};
	
	public static void dfs(int a, int b) {
		visited[a][b] = true;
		
		for(int i=0; i<4; i++) {
			int nr = a + dr[i];
			int nc = b + dc[i];
			
			if(nr >= 0 && nc >= 0 && nr < m && nc < n) {
				if(visited[nr][nc] == false && maps[nr][nc] == 1) {
					dfs(nr,nc);
				}
			}			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();		
		
		int x,y;
		for(int i=0; i<t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			k = sc.nextInt();
			
			maps = new int[m][n];
			visited = new boolean[m][n];
			
			for(int j=0; j<k; j++) {
				x = sc.nextInt();
				y = sc.nextInt();
				maps[x][y] = 1;
			}
			int ans = 0;
			
			for(int a = 0; a < m; a++) {
				for(int b = 0; b < n; b++) {
					if(visited[a][b] == false && maps[a][b] == 1) {
						dfs(a,b);
						ans++;
					}
				}
			}
			System.out.println(ans);
		}		
	}

}
