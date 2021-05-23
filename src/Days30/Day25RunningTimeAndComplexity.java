package Days30;

import java.util.Scanner;

public class Day25RunningTimeAndComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int T = sc.nextInt();
		
		/*
		int []a = new int[T];
		
		for(int i=0;i<T;i++)
		{
			a[i] = sc.nextInt();
		}
		
		int count=0;
		
		for(int i : a) {
			
			for(int j=1; j<i/2; j++) {
				if(i%j == 0 ) {
					count++; // 2
				}
			}
			
			if(count == 1) {
				System.out.println("Prime");
			}
			else if(i == 2){
				System.out.println("Prime");			
			}else if(i == 0) {
				System.out.println("Not prime");
			}
				else {
			
				System.out.println("Not prime");
			}
			count=0;
		}
	*/
		
		while(T-->0){
            int a = sc.nextInt();
            System.out.println(isPrime(a) ? "Prime" : "Not prime");
          }
		
	}
	
	static boolean isPrime(int n){
        if(n == 1) {
            return false;
        }
        
     int i = 2;
     while(i<=n/2){
         if(n%i == 0){
             return false;
         }
         i++;
     }
     return true;
    }
}
