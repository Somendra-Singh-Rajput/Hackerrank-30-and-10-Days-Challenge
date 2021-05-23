package Days10;

public class Day5PoissonDistributionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double euler = 2.71828;
		double lambda = 2.5;
		double x = 5;
		
		//fact(x);
		System.out.printf("%.3f",calPoisson(euler, lambda, x));	

	}
	
	static double calPoisson(double a,double b,double c) {
		
		double result = Math.pow(a, -b)*Math.pow(b, c);
		result = result/fact(c);
		
		return result;
	}
	
	static double fact(double a) {
		
		double f=1;
    	
    	while(a!=1) {
    		
    		f = f*a;
    		a--;
    	}
    	
    	return f;
	}

}
