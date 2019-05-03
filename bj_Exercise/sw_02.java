package bj_Exercise;

import java.util.*;

public class sw_02 {
	
	static int T;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int ans = 0;
			for(int j=0;j<10;j++) {
				int temp = sc.nextInt();
					ans += temp;
			}
			float ans_ = (float)ans/10;
			System.out.println("#"+(i+1)+" "+Math.round(ans_));
		}
	}

}
