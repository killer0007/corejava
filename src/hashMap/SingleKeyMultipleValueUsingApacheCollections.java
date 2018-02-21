package hashMap;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class SingleKeyMultipleValueUsingApacheCollections {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
//		MultiMap multiMap = new MultiValueMap();
		String path = "/home/ganesh/eclipse-workspace/javaForAutomation/src/hashMap/test.xml"; 
		File xmlfile = new File(path);
		DocumentBuilderFactory buildfactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = buildfactory.newDocumentBuilder();
		Document doc = docBuilder.parse(xmlfile);
		doc.getDocumentElement().normalize();
		
		
	}

}
