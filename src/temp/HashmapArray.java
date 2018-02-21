package temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashmapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashmapArray hh = new HashmapArray();
		List<HashMap> maplist1 = new ArrayList<HashMap>();
		maplist1=hh.listhash();
		System.out.println(maplist1);
		System.out.println(maplist1.get(0).get(2));
	}
	public   List<HashMap> listhash() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		List<HashMap> maplist = new ArrayList<HashMap>();
		map=hashmap("java", "qtp", "appache");
		map1=hashmap("java1", "qtp1", "appache1");
		maplist.add(map);
		maplist.add(map1);
		return maplist;
	}
	public  HashMap<Integer, String> hashmap(String name1,String name2, String name3) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, name1);
		hmap.put(2, name2);
		hmap.put(3, name3);
		return hmap;
	}
}
