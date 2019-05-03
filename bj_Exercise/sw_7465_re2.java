package bj_Exercise;

import java.util.*;

public class sw_7465_re2 {
	
	static int T,N,M;
	static int[] list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			N = sc.nextInt();
			M = sc.nextInt();
			list = new int[N+1];
			for(int j=0;j<N+1;j++) {
				list[j] = j;
			}
			for(int j=0;j<M;j++) {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				union(num1,num2);
//				printlist();
			}
			int ans = 0;
			for(int j=1;j<N+1;j++) {
				if(list[j]==j) {
					ans++;
				}
			}
			
			System.out.println("#"+i+" "+ans);
		}
	}
	
	public static int find(int x) {
		if(list[x]==x) {
			return x;
		} else {
			return find(list[x]);
		}
	}
	
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		list[y] = x;
	}
	
	public static void printlist() {
		for(int i=1;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}

}
