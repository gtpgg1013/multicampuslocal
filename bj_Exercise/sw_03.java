package bj_Exercise;

import java.util.*;

public class sw_03 {
	
	static int T;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int ans = 0;
			for(int j=0;j<10;j++) {
				int temp = sc.nextInt();
				if(temp>ans) {
					ans = temp;
				}
			}
			System.out.println("#"+(i+1)+" "+ans);
		}
	}

}
