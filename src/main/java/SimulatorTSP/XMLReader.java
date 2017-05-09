package SimulatorTSP;

/**
 * Created by Ivan on 09/05/2017.
 */

        import java.io.File;
        import java.util.ArrayList;

        import org.w3c.dom.Document;
        import org.w3c.dom.*;


        import javax.xml.parsers.DocumentBuilderFactory;
        import javax.xml.parsers.DocumentBuilder;
        import org.xml.sax.SAXException;
        import org.xml.sax.SAXParseException;

public class XMLReader {
    private ArrayList<Product> order1 = new ArrayList<Product>();


    public XMLReader(){
        try {

            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File("namen.xml"));

            // normalize text representation
            doc.getDocumentElement ().normalize ();
            //System.out.println ("Root element of the doc is " + doc.getDocumentElement().getNodeName());
            NodeList productList = doc.getElementsByTagName("product");
            for(int s=0; s<productList.getLength() ; s++){
                                int hoogte = 0;
                int xcoord = 0;
                int ycoord = 0;

                Node firstProductNode = productList.item(s);
                if(firstProductNode.getNodeType() == Node.ELEMENT_NODE){


                    Element firstProductElement = (Element)firstProductNode;

                    //-------
                    NodeList productHoogte = firstProductElement.getElementsByTagName("hoogte");
                    Element hoogteElement = (Element)productHoogte.item(0);

                    NodeList textFNList = hoogteElement.getChildNodes();
                    hoogte = Integer.parseInt(((Node)textFNList.item(0)).getNodeValue().trim());
                    //-------
                    NodeList productX = firstProductElement.getElementsByTagName("Xcoord");
                    Element xElement = (Element)productX.item(0);

                    NodeList xList = xElement.getChildNodes();
                    xcoord = Integer.parseInt(((Node)xList.item(0)).getNodeValue().trim());
                    //-------
                    NodeList productY = firstProductElement.getElementsByTagName("Xcoord");
                    Element yElement = (Element)productY.item(0);

                    NodeList yList = yElement.getChildNodes();
                    ycoord = Integer.parseInt(((Node)yList.item(0)).getNodeValue().trim());

                }
                order1.add(new Product("naam",new Locatie(xcoord,ycoord),hoogte));
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

    }



    public ArrayList<Product> getOrder(){
        return order1;
    }
}
