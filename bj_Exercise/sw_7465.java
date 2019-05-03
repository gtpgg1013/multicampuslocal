package bj_Exercise;

import java.util.*;

public class sw_7465 {
	
	static int T,N,M;
	static int[] list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int gnum = 1;
			N = sc.nextInt();
			M = sc.nextInt();
			list = new int[N+1];
			for(int j=0;j<M;j++) {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				{
				if(list[num1]==0 && list[num2]==0) {
					list[num1] = gnum;
					list[num2] = gnum;
					gnum++;
				} else if(list[num1]==0 && list[num2]!=0) {
					list[num1] = list[num2];
				} else if(list[num1]!=0 && list[num2]==0) {
					list[num2] = list[num1];
				} else {
					int tempnum1 = list[num1];
					int tempnum2 = list[num2];
					if(tempnum1!=tempnum2) {
						int low, high;
//						if(tempnum1>tempnum2) {
//							low = tempnum2;
//							high = tempnum1;
//						} else {
							low = tempnum1;
							high = tempnum2;
//						}
						for(int k=1;k<N+1;k++) {
							if(list[k]==high) {
								list[k] = low;
							}
						}
					}
				}
//				printlist();
				}
			}
			Arrays.sort(list);
			int ans = 0;
			for(int j=1;j<N-1;j++) {
				if(list[j]!=list[j+1]) {
					ans++;
				}
			}
//			printlist();
			System.out.println("#"+(i+1)+" "+(ans+1));
		}
	}
	
	public static void printlist() {
		for(int i=0;i<N+1;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}

}
