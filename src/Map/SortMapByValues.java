package Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Character> mp = new HashMap<>();
		
		mp.put(1, 'A');
		mp.put(4, 'C');
		mp.put(5, 'E');
		mp.put(3, 'D');
		mp.put(2, 'B');
		mp.put(6, 'G');
		mp.put(7, 'F');
		
		System.out.println("Before sorting : ");
		
		Set set = mp.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry ch = (Map.Entry) it.next();
			System.out.println("Key : "+ch.getKey());
			System.out.println("Value : "+ch.getValue());
			
		}
		
		System.out.println("After sorting : ");
		
		 Map<Integer, Character> map = sortByValue(mp); 
		 
		Set set1 = map.entrySet();
		Iterator it1 = set1.iterator();
		
		while(it1.hasNext()) {
			
			Map.Entry ch = (Map.Entry) it1.next();
			System.out.println("Key : "+ch.getKey());
			System.out.println("Value : "+ch.getValue());
			
		}
		
	}
	
	public static HashMap sortByValue(Map<Integer, Character> mp) {
		
		List list = new LinkedList(mp.entrySet());
		
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });
	       
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap; 
	}
}
