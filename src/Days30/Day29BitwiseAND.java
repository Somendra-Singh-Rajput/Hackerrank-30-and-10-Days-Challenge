package Days30;

import java.util.Scanner;

public class Day29BitwiseAND {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            String[] nk = scanner.nextLine().split(" ");

	            int n = Integer.parseInt(nk[0]);

	            int k = Integer.parseInt(nk[1]);
	            
	            calMax(n,k);
	        }

	       
	        
	        scanner.close();
	        	        
	}
	
	static void calMax(int n, int k) {
    	int max = 0;
    	for(int i=1;i<=n;i++) {
    		for(int j=1; j<i;j++) {
    			
    			int bitAnd = i & j;
    			if((max < bitAnd) && (bitAnd < k)) {
    				max = bitAnd;
    			}
    		}
    	}
    	
    	System.out.println(max+"");
    }

}
