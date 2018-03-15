package sortmapbyValue;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class byvalue {
public static boolean ASC = true;
public static boolean DESC = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		System.out.println("*************before sorting**************");
		printMap(hmap);
		System.out.println("*************assending**************");
		Map<Integer, String> assent = sortByComparator(hmap,ASC);
		printMap(assent);
		System.out.println("*************decending**************");
		Map<Integer, String> decent = sortByComparator(hmap, DESC);
		printMap(decent);
	}
public static Map<Integer, String> sortByComparator(Map<Integer, String> sortmap, final boolean order) {
	List<Entry<Integer, String>> list = new LinkedList<Entry<Integer, String>>(sortmap.entrySet());
	
	//sorting the list based on value
	
	Collections.sort(list, new Comparator<Entry<Integer, String>>() {

		@Override
		public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
			// TODO Auto-generated method stub
			if(order) {
				return o1.getValue().compareTo(o2.getValue());
			}
			else {
			return o2.getValue().compareTo(o1.getValue());
			}
			
		}
		
	});
	Map<Integer, String> sortedmap = new LinkedHashMap<Integer, String>();
	for(Entry<Integer, String> entry:list) {
		sortedmap.put(entry.getKey(), entry.getValue());
	}
	return sortedmap;
}
public static void  printMap(Map<Integer, String> mapp) {
	for(Entry<Integer, String> entry:mapp.entrySet()) {
		System.out.print(entry.getKey()+":");
		System.out.println(entry.getValue());
	}
}
}
