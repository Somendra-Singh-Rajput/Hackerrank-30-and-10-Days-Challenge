package Days10;

public class Day6TheCentralLimitTheoremI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double maxWeight = 9800;
		double totalBox = 49;
		double mean = 205;
		double deviation = 15;
		
		double l = 0.9901;
		
		double result = ((maxWeight-mean*totalBox)/(deviation*Math.sqrt(totalBox)));		
			
		System.out.printf("%.4f",1-l-.0001);
				
	}

}
