package pkck;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

/**
 * Hello world!
 */
public class App {
    private static JAXBContext jaxbContext;
    private static Unmarshaller unmarshaller;
    private static Marshaller marshaller;
    private static Schema schema;

    private static String xmlFilePath;
    private static String xmlToSaveFilePath;
    private static String xsdFilePath;
    private static String summaryFilePath;
    private static String htmlSchema;


    public static void main(String[] args) {

    }
}
