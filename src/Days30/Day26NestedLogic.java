package Days30;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Day26NestedLogic {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int D1 = sc.nextInt();
		int M1 = sc.nextInt();
		int Y1 = sc.nextInt();
		
		int D2 = sc.nextInt();
		int M2 = sc.nextInt();
		int Y2 = sc.nextInt();
		
		LocalDate returnDate = LocalDate.now();
		LocalDate dueDate = LocalDate.now();
		
		if(D1>=1 && D1<=31) {
			if(M1>=1 && M1<=12) {
				if(Y1>=1 && Y1<=3000) {
					
					returnDate = LocalDate.of(Y1, M1, D1);
				}
			}
		}
		
		if(D2>=1 && D2<=31) {
			if(M2>=1 && M2<=12) {
				if(Y2>=1 && Y2<=3000) {
					
					dueDate = LocalDate.of(Y2, M2, D2);
				}
			}
		}
		
		
		Period diff = Period.between(dueDate, returnDate);
		

		if(diff.getYears() <= 0 && Y1 <= Y2) {
			if(diff.getMonths() <= 0) {
				if(diff.getDays() >= 0) {
					System.out.println(diff.getDays()*15);
				}
				else {
					System.out.println("0");
				}
			}else {
				System.out.println(diff.getMonths()*500);
			}
		}else {
			System.out.println("10000");
		}
	    
	}

}
