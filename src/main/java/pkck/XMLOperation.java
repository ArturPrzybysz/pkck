package pkck;

import org.xml.sax.SAXException;
import pkck.Model.Document;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class XMLOperation {
    private static JAXBContext jaxbContext;
    private static Unmarshaller unmarshaller;
    private static Marshaller marshaller;
    private static Schema schema;

    private static String xmlFilePath;
    private static String xmlToSaveFilePath;
    private static String xsdFilePath;

    public static Document document;

    static {
        xmlFilePath = "file.xml";
        xmlToSaveFilePath = "file2.xml";
        xsdFilePath = "main.xsd";

        try {
            jaxbContext = JAXBContext.newInstance(Document.class);
            unmarshaller = jaxbContext.createUnmarshaller();
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            schema = schemaFactory.newSchema(new File(xsdFilePath));
            marshaller = jaxbContext.createMarshaller();
            marshaller.setSchema(schema);
            marshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, xsdFilePath);
            unmarshaller.setSchema(schema);
        } catch (JAXBException | SAXException e) {
            e.printStackTrace();
        }
    }

    public static void saveToXML() throws Exception {
        marshaller.marshal(document, new File(xmlToSaveFilePath));
    }

    public static void readFromXML() throws JAXBException, FileNotFoundException {
        document = (Document) unmarshaller.unmarshal(new FileInputStream(new File(xmlFilePath)));
    }


    public static String getXmlFilePath() {
        return xmlFilePath;
    }

    public static String getXsdFilePath() {
        return xsdFilePath;
    }

    public static void setXmlFilePath(String xmlFilePath) {
        XMLOperation.xmlFilePath = xmlFilePath;
    }

    public static String getXmlToSaveFilePath() {
        return xmlToSaveFilePath;
    }

    public static void setXmlToSaveFilePath(String xmlToSaveFilePath) {
        XMLOperation.xmlToSaveFilePath = xmlToSaveFilePath;
    }
}