package Test;

public class SubSequenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Somendra";
		String str2 = "ondm";
		int i=0,j=0;
		
		boolean flag = false;
		
		if(str2.length()==0) {
			flag = true;
		}
				
		while(i<str2.length() && j<str1.length()) {
			if(str2.charAt(i) == str1.charAt(j)) {
				i++;
			}
			
			if(str2.length()==i) {
				flag = true;
			}
			j++;
		}
		
		//flag = false;
		
		if(flag==true) {
			System.out.println(str2+" is "+"subsequence of "+str1);
		}else {
			System.out.println(str2+" is not a "+"subsequence of "+str1);
		}
	}

}
