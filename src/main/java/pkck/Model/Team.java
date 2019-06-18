
package pkck.Model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for team.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="team">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="czerwony"/>
 *     &lt;enumeration value="niebieski"/>
 *     &lt;enumeration value="zielony"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "team", namespace = "http://www.przyklad.pl/main")
@XmlEnum
public enum Team {

    @XmlEnumValue("czerwony")
    CZERWONY("czerwony"),
    @XmlEnumValue("niebieski")
    NIEBIESKI("niebieski"),
    @XmlEnumValue("zielony")
    ZIELONY("zielony");
    private final String value;

    Team(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Team fromValue(String v) {
        for (Team c: Team.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
