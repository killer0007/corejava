package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleKeyMultipleValueUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, List<String>> hmap = new HashMap<String, List<String>>();
//		
		List<String> setOne = new ArrayList<String>();
		
		setOne.add("Java");
		setOne.add("selenium");
		
		List<String> setTwo = new ArrayList<String>();
		setTwo.add("python");
		setTwo.add("robot");
		
		List<String> setThree = new ArrayList<String>();
		setThree.add("c");
		setThree.add("c++");
		
		
		hmap.put("1", setOne);
		hmap.put("2", setTwo);
		hmap.put("3", setThree);
		
		
		System.out.println(hmap);
		System.out.println("Fetching Keys and corresponding [Multiple] Values n");
		
		for(Map.Entry<String, List<String>> entry:hmap.entrySet()) {
			String key = entry.getKey();
			List<String> values = entry.getValue();
			
			 System.out.println("Key = " + key);
	            System.out.println("Values = " + values);
		}
		SingleKeyMultipleValueUsingList se = new SingleKeyMultipleValueUsingList();
		System.out.println("start");
		se.listhash();
		
	}
	public  void listhash() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//List<HashMap> maplist = new ArrayList<HashMap>();
		System.out.println("called");
		map=hashmap();
		System.out.println(map);
//		maplist.add(hmap);
	}
	public  HashMap<Integer, String> hashmap() {
		System.out.println("processing");
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "java");
		hmap.put(2, "selenium");
		hmap.put(2, "QTP");
		System.out.println("processed");
		return hmap;
	}
}
