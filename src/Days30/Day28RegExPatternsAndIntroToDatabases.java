package Days30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28RegExPatternsAndIntroToDatabases {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        TreeMap<String,String> tm = new TreeMap<>();
        
        	
        	for (int NItr = 0; NItr < N; NItr++) {
                String[] firstNameEmailID = scanner.nextLine().split(" ");

                String firstName = firstNameEmailID[0];

                String emailID = firstNameEmailID[1];
                
                String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-][gmail]+(\\.(?:[A-Z]{2,}|com|org))+$";
                //Creating a pattern object
                Pattern pattern = Pattern.compile(regex);
                //Creating a Matcher object
                Matcher matcher = pattern.matcher(emailID);
                
                if(firstName.length() <= 20 && firstName.matches("^[a-z]+$") && emailID.length() <= 50 && matcher.matches()) {
                	
                	tm.put(emailID, firstName);
                }               
                
        	}
        
        	sortFirstName(tm);
        	
        scanner.close();
            
	}
	
	static void sortFirstName(TreeMap<String,String> hm) {
        
		List<String> list = new ArrayList<>();
		
        for (Map.Entry<String, String> entry : hm.entrySet())  {
        	list.add(entry.getValue());
        }
           
        
        Collections.sort(list);
        
        for(String s : list) {
        	System.out.println(s);
        }
		
	}
}
