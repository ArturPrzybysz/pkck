
package pkck.Model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemPrefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemPref" type="{http://www.przyklad.pl/main}itemPrefType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemPrefs", namespace = "http://www.przyklad.pl/main", propOrder = {
    "itemPref"
})
public class ItemPrefs {

    @XmlElement(required = true)
    protected List<ItemPrefType> itemPref;

    /**
     * Gets the value of the itemPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPrefType }
     * 
     * 
     */
    public List<ItemPrefType> getItemPref() {
        if (itemPref == null) {
            itemPref = new ArrayList<ItemPrefType>();
        }
        return this.itemPref;
    }

}
