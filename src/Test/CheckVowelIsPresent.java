package Test;

public class CheckVowelIsPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Somendra";
		s = s.toLowerCase();
		
		char[] c = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				c[i] = s.charAt(i);
			}
		}
		
		System.out.println("Below is the list of vowels which are present in the string: ");
		
		for(char ch : c) {
			System.out.print(ch+" ");
		}
	}

}
