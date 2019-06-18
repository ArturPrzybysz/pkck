
package pkck.Model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for teamRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="teamRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="boss"/>
 *     &lt;enumeration value="noob"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "teamRole", namespace = "http://www.przyklad.pl/main")
@XmlEnum
public enum TeamRole {

    @XmlEnumValue("boss")
    BOSS("boss"),
    @XmlEnumValue("noob")
    NOOB("noob");
    private final String value;

    TeamRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TeamRole fromValue(String v) {
        for (TeamRole c: TeamRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
