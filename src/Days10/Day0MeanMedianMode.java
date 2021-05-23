package Days10;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day0MeanMedianMode {

	private static DecimalFormat df1 = new DecimalFormat("#.#");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		
		int []val = new int[N];
		
		for(int i=0;i<N;i++) {
			val[i] = sc.nextInt();
		}
		
		System.out.println(mean(val));
		System.out.println(median(val));
		System.out.println(mode(val));
		
		sc.close();
	}
	
	static double mean(int[] a) {
		
		int len = a.length;	
		double sum = 0,i=0; 
		
		while(i<len) {
			sum += (double)a[(int) i];
			i += 1;
		}
		
		double mean = sum/len;
		
		String formatted = df1.format(mean); 
		
		return Double.valueOf(formatted);
	}
	
	static double median(int[] b) {
		
		long len = b.length;
		Arrays.sort(b);
		double median = 0;
		
		String formatted = ""; 
		
		if(len%2 == 0) {
					
			long secondTerm = len/2;
			long firstTerm = secondTerm-1;
		    median = ((double)b[(int)firstTerm] + (double)b[(int)secondTerm])/2;
		    formatted = df1.format(median);
		    
		}else {
			
			long term = (long)Math.ceil((len/2));
			median = b[(int)term];
			formatted = df1.format(median);
		}
		return Double.valueOf(formatted);
	}
	
	static int mode(int[] c) {
		
		int mode = 0;
		int count = 0;
		int maxCount = 0;
		
		for(int i=0; i<c.length;i++) {
			for(int j=0; j<c.length;j++) {
				if(c[i] == c[j]) {
					count++;
					if(count > maxCount) {
						maxCount = count;
						mode = c[i];
						
					}
				}
			}
			
			count = 0;
		}
		
		return mode;
	}
}
