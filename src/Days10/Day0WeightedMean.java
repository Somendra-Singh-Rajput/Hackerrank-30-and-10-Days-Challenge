package Days10;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Day0WeightedMean {

	 private static DecimalFormat df = new DecimalFormat("#.#");
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] X = new int[N];
		int[] W = new int[N];

		for(int i=0; i<N;i++) {
		  
		 X[i] = sc.nextInt(); }
		  
		for(int j=0; j<N;j++) {
		  
		  W[j] = sc.nextInt(); }
		  
		 
		System.out.println(weightedMean(X, W));

	}

	static double weightedMean(int[] x, int[] y) {

		int[] xySumArr = new int[x.length];

		df.setRoundingMode(RoundingMode.HALF_UP);
		
		for (int i = 0; i < xySumArr.length; i++) {
			xySumArr[i] = x[i] * y[i];
		}

		double xySum = 0, ySum = 0, wmean = 0;

		for (int i : xySumArr) {
			xySum += i;
		}

		for (int j : y) {
			ySum += j;
		}

		wmean = xySum / ySum;

		String wm = df.format(wmean); 
		
		return Double.valueOf(wm);
	}
}
