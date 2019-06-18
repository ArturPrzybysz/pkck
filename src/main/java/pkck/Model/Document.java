
package pkck.Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authors" type="{http://www.przyklad.pl/main}authors"/>
 *         &lt;element name="racePrefs" type="{http://www.przyklad.pl/main}racePrefs"/>
 *         &lt;element name="typePrefs" type="{http://www.przyklad.pl/main}typePrefs"/>
 *         &lt;element name="itemPrefs" type="{http://www.przyklad.pl/main}itemPrefs"/>
 *         &lt;element name="creatures" type="{http://www.przyklad.pl/main}creatures"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authors",
    "racePrefs",
    "typePrefs",
    "itemPrefs",
    "creatures"
})
@XmlRootElement(name = "document", namespace = "http://www.przyklad.pl/main")
public class Document {

    @XmlElement(required = true)
    protected Authors authors;
    @XmlElement(required = true)
    protected RacePrefs racePrefs;
    @XmlElement(required = true)
    protected TypePrefs typePrefs;
    @XmlElement(required = true)
    protected ItemPrefs itemPrefs;
    @XmlElement(required = true)
    protected Creatures creatures;

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link Authors }
     *     
     */
    public Authors getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authors }
     *     
     */
    public void setAuthors(Authors value) {
        this.authors = value;
    }

    /**
     * Gets the value of the racePrefs property.
     * 
     * @return
     *     possible object is
     *     {@link RacePrefs }
     *     
     */
    public RacePrefs getRacePrefs() {
        return racePrefs;
    }

    /**
     * Sets the value of the racePrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RacePrefs }
     *     
     */
    public void setRacePrefs(RacePrefs value) {
        this.racePrefs = value;
    }

    /**
     * Gets the value of the typePrefs property.
     * 
     * @return
     *     possible object is
     *     {@link TypePrefs }
     *     
     */
    public TypePrefs getTypePrefs() {
        return typePrefs;
    }

    /**
     * Sets the value of the typePrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrefs }
     *     
     */
    public void setTypePrefs(TypePrefs value) {
        this.typePrefs = value;
    }

    /**
     * Gets the value of the itemPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPrefs }
     *     
     */
    public ItemPrefs getItemPrefs() {
        return itemPrefs;
    }

    /**
     * Sets the value of the itemPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPrefs }
     *     
     */
    public void setItemPrefs(ItemPrefs value) {
        this.itemPrefs = value;
    }

    /**
     * Gets the value of the creatures property.
     * 
     * @return
     *     possible object is
     *     {@link Creatures }
     *     
     */
    public Creatures getCreatures() {
        return creatures;
    }

    /**
     * Sets the value of the creatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creatures }
     *     
     */
    public void setCreatures(Creatures value) {
        this.creatures = value;
    }

}
