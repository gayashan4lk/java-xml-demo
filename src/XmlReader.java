import javax.swing.plaf.synth.SynthTextAreaUI;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class XmlReader {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ErangaGayashanBISTEC\\IdeaProjects\\ReadXMLFileDemo\\src\\myfile.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            System.out.println("Root element: " + document.getDocumentElement().getNodeName());

            NodeList nodeList = document.getElementsByTagName("student");

            for (int i = 0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);
                System.out.println("\nNode Name: " + node.getNodeName());

                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;

                    System.out.println("Student Id: " + element.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("First Name: "+ element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name: " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Subject: "+ element.getElementsByTagName("subject").item(0).getTextContent());
                    System.out.println("Marks: "+ element.getElementsByTagName("marks").item(0).getTextContent());
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}