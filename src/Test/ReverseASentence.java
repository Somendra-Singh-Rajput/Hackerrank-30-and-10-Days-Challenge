package Test;

public class ReverseASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "My name is Somendra Singh Rajput";
		
		String[] arr = new String[str1.length()];
		
		arr = str1.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
