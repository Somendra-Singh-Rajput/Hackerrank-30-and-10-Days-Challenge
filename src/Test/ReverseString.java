package Test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Somendra";
		String str2 = "";
		
		char[] c  = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			
			str2 = str2 + c[i];
		}
		System.out.println(str2);
		
		String str3 = getReverseString(str);
		System.out.println(str3);

	}
	
	public static String getReverseString(String s) {
		
		if(s.length()<=1) {
			return s;
		}
		return (getReverseString(s.substring(1))+s.charAt(0));
	}

}
