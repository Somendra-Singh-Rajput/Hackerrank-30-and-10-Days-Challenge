package Test;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int c=1;
		
		int num = 10;
		
		for(int i=1;i<=num;i++) {
			
			System.out.print(a+",");
			a = b;
			b = c;
			c = a+b;
			
		}

	}

}
