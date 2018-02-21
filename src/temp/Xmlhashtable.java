package temp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xmlhashtable {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String path = "/home/ganesh/eclipse-workspace/javaForAutomation/src/temp/test.xml";
		File file = new File(path);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(file);

		//System.out.println("root element was : " + doc.getDocumentElement().getNodeName());
		NodeList nlist = doc.getElementsByTagName("staff");
		int nodelenght = nlist.getLength();
		//System.out.println("length is : " + nodelenght);
		List<LinkedHashMap<String, String>> main = new ArrayList<LinkedHashMap<String, String>>();
		for (int i = 0; i < nodelenght; i++) {
			Node node = nlist.item(i);
			//System.out.println("the current element is : " + node.getNodeName());
			LinkedHashMap<String, String> hmap = new LinkedHashMap<String, String>();
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				
				hmap.put("Staff id", eElement.getAttribute("id"));
				hmap.put("First Name", eElement.getElementsByTagName("firstname").item(0).getTextContent());
				hmap.put("Last Name", eElement.getElementsByTagName("lastname").item(0).getTextContent());
				hmap.put("Nick Name", eElement.getElementsByTagName("nickname").item(0).getTextContent());
				hmap.put("Salary", eElement.getElementsByTagName("salary").item(0).getTextContent());				
			}
			main.add(hmap);
		}
		//System.out.println(main.get(0).get("Salary"));
		Iterator<LinkedHashMap<String, String>> al = main.iterator();
		while (al.hasNext()) {
			System.out.println(al.next());
		}
	}

}
