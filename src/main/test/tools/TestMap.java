package tools;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class TestMap {
    @Test
    public void test() throws Exception{
        XMLTools xmlSource = new XMLTools();
        Document source = xmlSource.covertFileToNode("./source.xml");
        Document target = xmlSource.covertFileToNode("./target.xml");
        Element targetEle = target.getDocumentElement();
        NodeList list = targetEle.getChildNodes();

        Document tempDoc = (Document)source.cloneNode(true);
//        Nodelist list = tempDoc.
        Element tempDocEle = tempDoc.getDocumentElement();

        Node compAttrInfo = tempDocEle.getElementsByTagName("compAttrInfo").item(0);

        tempDocEle.removeChild(compAttrInfo);

        // System.out.println(XMLTools.xmlToString(tempDocEle));

        Element newEle = tempDoc.createElement("compAttrInfo");
        for(int i=0;i<list.getLength();i++){
            if(list.item(i).getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) list.item(i);
                String name = element.getNodeName();
                String value = element.getTextContent();
                if(value == null){
                    value = "";
                }
                Node node = tempDoc.createElement(name);
                node.setTextContent(value);
                newEle.appendChild(node);
            }
        }
        tempDocEle.appendChild(newEle);
        System.out.println(XMLTools.xmlToString(tempDoc));


        //NodeList sourceList = tempDocEle.getChildNodes();


//        for(int i=0;i<sourceList.getLength();i++){
//            if(sourceList.item(i).getNodeType() == Node.ELEMENT_NODE){
//                Element element = (Element) sourceList.item(i);
//                // System.out.println(XMLTools.xmlToString(element));
//                String name = element.getTagName();
//                NodeList temp = target.getElementsByTagName(name);
//                if(temp.getLength()<1){
//                    continue;
//                } else {
//                    String newStr = temp.item(0).getTextContent();
//                    element.setTextContent(newStr);
//                }
//                String value = element.getTextContent();
//                System.out.println(name + "  " +value);
//            }
//        }
       // System.out.println(XMLTools.xmlToString(tempDoc));
       // System.out.println(XMLTools.xmlToString(tempDoc));
    }

}
