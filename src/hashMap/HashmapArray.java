package hashMap;

import java.util.HashMap;

public class HashmapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashmapArray hh = new HashmapArray();
		hh.listhash();
	}
	public  static void listhash() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//List<HashMap> maplist = new ArrayList<HashMap>();
		System.out.println("called");
		map=hashmap();
		System.out.println(map);
//		maplist.add(hmap);
	}
	public static HashMap<Integer, String> hashmap() {
		System.out.println("processing");
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "java");
		hmap.put(2, "selenium");
		hmap.put(2, "QTP");
		System.out.println("processed");
		return hmap;
	}
}
