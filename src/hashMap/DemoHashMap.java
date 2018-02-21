package hashMap;

import java.util.HashMap;
import java.util.Map;
public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> hm=new HashMap<Integer, String>();
		 hm.put(100, "name1");
		 hm.put(200, "name2");
		 System.out.println(hm);
		 for (Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}

}
