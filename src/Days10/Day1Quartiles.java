package Days10;

import java.util.Arrays;
import java.util.Scanner;

public class Day1Quartiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		int []lower = new int[(N + 1) / 2 - 1];
		int []upper = new int[(N + 1) / 2 - 1];
		
		int []lower1 = new int[(N/2) - 1];
		int []upper1 = new int[(N/2) - 1];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.print(i+" ");
			
		}System.out.println();

		int Q1=0,Q2=0,Q3=0;

		if (N % 2 == 1) {
			
			Q2 = arr[(N + 1) / 2 - 1];

			for(int i=0 ;i<(N + 1) / 2 - 1; i++) {

				lower[i] = arr[i];
			}
			
			if (lower.length % 2 == 1) {
				
				Q1 = lower[(lower.length + 1) / 2 - 1];
			}
			else {
				int la = lower.length/2; 
				
				int lb = la-1;

				Q1 = (lower[la]+lower[lb])/2;
			}
			
			int j=0;
			for(int i=(N + 1) / 2 ;i<arr.length;i++) {
				upper[j] = arr[i];
				j++;
			}
			
			if (upper.length % 2 == 1) 
			{
				Q3 = upper[(upper.length + 1) / 2 - 1];
			}
			else {
				int ua = upper.length/2; 
				
				int ub = ua-1;

				Q3 = (upper[ua]+upper[ub])/2;
			}
			

		}else {

			int a = N/2;
			
			int b = a-1;

			Q2 = (arr[a]+arr[b])/2;

			for(int i=0 ;i<(N/2-1); i++) {

				lower1[i] = arr[i];
			}

			if (lower1.length % 2 == 1) 
			{
				Q1 = lower1[(lower1.length + 1) / 2 - 1];
			}
			else {
				int la = lower1.length/2; 
				
				int lb = la-1;

				Q1 = (lower1[la]+lower1[lb])/2;
			}

			int j=0;
			for(int i=N/2+1;i<arr.length;i++) {
				upper1[j] = arr[i];
				j++;
			}

			if (upper1.length % 2 == 1) 
			{
				Q3 = upper1[(upper1.length + 1) / 2 - 1];
			}
			else {
				int ua = upper1.length/2; 
				
				int ub = ua-1;

				Q3 = (upper1[ua]+upper1[ub])/2;
			}

		}

		System.out.println(Q1);
		System.out.println(Q2);
		System.out.println(Q3);
		sc.close();
	}

}

/*
 9 
 3 7 8 5 12 14 21 13 18
 */
