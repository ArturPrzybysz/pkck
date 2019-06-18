package pkck;

import pkck.Model.Document;

public class MainTrial {

    public static void main(String[] args) {
        try {
            XMLOperation.readFromXML();
            Document document = XMLOperation.document;
            document.getAuthors().getAuthor().get(0).setFirstName("Inne");
            XMLOperation.saveToXML();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
