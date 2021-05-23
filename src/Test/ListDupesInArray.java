package Test;

import java.util.HashMap;
import java.util.Map;

public class ListDupesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,2,4,5,3,6,6,8,9,8,7,10};
		
		Map<Integer,Integer> mp = new HashMap<>();
		
		for(int i : arr) {
			
			if(mp.containsKey(i)) {
				mp.put(i, mp.get(i)+1);
			}else {
				mp.put(i, 1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry :mp.entrySet()) {
			
			if(entry.getValue()>=2) {
				System.out.println(entry.getKey());
			}
		}

	}

}
