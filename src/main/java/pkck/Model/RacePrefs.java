
package pkck.Model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for racePrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="racePrefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="racePref" type="{http://www.przyklad.pl/main}racePrefType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "racePrefs", namespace = "http://www.przyklad.pl/main", propOrder = {
    "racePref"
})
public class RacePrefs {

    @XmlElement(required = true)
    protected List<RacePrefType> racePref;

    /**
     * Gets the value of the racePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the racePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRacePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RacePrefType }
     * 
     * 
     */
    public List<RacePrefType> getRacePref() {
        if (racePref == null) {
            racePref = new ArrayList<RacePrefType>();
        }
        return this.racePref;
    }

}
