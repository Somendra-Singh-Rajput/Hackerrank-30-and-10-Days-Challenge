package Test;


public class Test {

	public static void main(String[] args){

		String s = "the    sky    is blue ";
		
		s  = s.trim();

		String []str = s.split(" ");

		int len = str.length;
		//System.out.println(len);

		for(int i=len-1; i>=0; i--){

		 if(str[i] != "") {
			 System.out.print(str[i] + " ");
		 }

		}
	}
	
}