package Test;

import java.util.ArrayList;
import java.util.List;

public class CheckPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23;
		int num2 = 100;
		int flag=0;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+" Number is prime.");
		}else {
			System.out.println(num+" Number is not prime.");
		}
		
		primeBTRange(num, num2);

	}
	
	public static void primeBTRange(int a, int b) {
		
		int flag=0;
		List<Integer> list = new ArrayList<>();
		
		for(int start=a; start<=b; start++) {
			
			for(int i=2; i<=start/2; i++) {
				
				if(start%i==0) {
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				list.add(start);
			}
			flag=0;
			
		}
		
		System.out.println(list);
	}

}
