package Test;

import java.util.Scanner;

public class ValidEmail {

	public static void main(String[] args) {
        try {
            String mydomain = "javahungry@google.com";
            String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-][gmail]+(\\.(?:[A-Z]{2,}|com|org))+$";
            Boolean result = mydomain.matches(emailregex);
            
            if (result == false) {
                System.out.println("Email Address is Invalid");
                }else if(result == true){
                System.out.println("Email Address is Valid");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
