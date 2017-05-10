package simulatorTSP;

/**
 * Created by Ivan on 09/05/2017.
 */

        import java.io.File;
        import java.util.ArrayList;

        import org.w3c.dom.Document;
        import org.w3c.dom.*;


        import javax.xml.parsers.DocumentBuilderFactory;
        import javax.xml.parsers.DocumentBuilder;
        import javax.xml.parsers.ParserConfigurationException;

        import org.xml.sax.SAXException;
        import org.xml.sax.SAXParseException;

public class XMLReader {

    private DocumentBuilderFactory docBuilderFactory ;
    private DocumentBuilder docBuilder;

    public XMLReader(){

        docBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            docBuilder = docBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<ArrayList<Product>> ReadXmlFile(File file){
        ArrayList<ArrayList<Product>> orderArray = new ArrayList<ArrayList<Product>>();

        try {
            Document doc = docBuilder.parse (file);
            doc.getDocumentElement().normalize ();
            NodeList orderList = doc.getElementsByTagName("order");

            for(int orderIndex=0; orderIndex<orderList.getLength() ; orderIndex++) {
                Node OrderNode = orderList.item(orderIndex);
                if(OrderNode.getNodeType() == Node.ELEMENT_NODE){
                    Element OrderElement = (Element) OrderNode;

                    NodeList productList = OrderElement.getElementsByTagName("product");
                    ArrayList<Product> order = new ArrayList<Product>();
                    for (int productIndex = 0; productIndex < productList.getLength(); productIndex++) {
                        int hoogte = 0;
                        int xcoord = 0;
                        int ycoord = 0;

                        Node ProductNode = productList.item(productIndex);
                        if (ProductNode.getNodeType() == Node.ELEMENT_NODE) {


                            Element firstProductElement = (Element) ProductNode;

                            //-------
                            NodeList productHoogte = firstProductElement.getElementsByTagName("hoogte");
                            Element hoogteElement = (Element) productHoogte.item(0);

                            NodeList textFNList = hoogteElement.getChildNodes();
                            hoogte = Integer.parseInt(((Node) textFNList.item(0)).getNodeValue().trim());
                            //-------
                            NodeList productX = firstProductElement.getElementsByTagName("Xcoord");
                            Element xElement = (Element) productX.item(0);

                            NodeList xList = xElement.getChildNodes();
                            xcoord = Integer.parseInt(((Node) xList.item(0)).getNodeValue().trim());
                            //-------
                            NodeList productY = firstProductElement.getElementsByTagName("Ycoord");
                            Element yElement = (Element) productY.item(0);

                            NodeList yList = yElement.getChildNodes();
                            ycoord = Integer.parseInt(((Node) yList.item(0)).getNodeValue().trim());

                        }
                        order.add(new Product("naam", new Locatie(xcoord, ycoord), hoogte));
                    }
                    orderArray.add(order);
                }
            }
        }catch (SAXParseException err) {
            System.out.println ("** Er is een syntax fout opgetreden op lijn " + err.getLineNumber ()+".");
            System.out.println(" " + err.getMessage ());
        }catch (SAXException e) {
            Exception x = e.getException ();
            ((x == null) ? e : x).printStackTrace ();
        }catch (Throwable t) {
            t.printStackTrace ();
        }
        return orderArray;
    }
}
