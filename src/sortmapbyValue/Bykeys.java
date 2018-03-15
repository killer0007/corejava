package sortmapbyValue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Bykeys {

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
System.out.println("before sorting");
Set set = hmap.entrySet();
Iterator ite = set.iterator();
while(ite.hasNext()) {
	Map.Entry me = (Map.Entry) ite.next();
	System.out.print(me.getKey()+":");
	System.out.println(me.getValue());
}
System.out.println("after sorting");
Map<Integer, String> tmap = new TreeMap<Integer, String>(hmap);
Set set1 = tmap.entrySet();
Iterator ite1 = set1.iterator();
while(ite1.hasNext()) {
	Map.Entry mee = (Map.Entry) ite1.next();
	System.out.print(mee.getKey()+":");
	System.out.println(mee.getValue());
}
	}

}
