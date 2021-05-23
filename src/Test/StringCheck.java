package Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String name = "";
        String email = "";

        TreeMap<String,String> hm = new TreeMap<>();
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            if((firstName.length() <= 20 && firstName.matches("^[a-z]+$")) || (emailID.length() <= 50 && emailID.matches("^[a-z+]+@(.+)$"))) {
        	
            	hm.put(emailID, firstName);
            }
        }
        
        System.out.println(hm);

        scanner.close();
		
	}

}



/*
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
*/
