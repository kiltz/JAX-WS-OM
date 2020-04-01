
package de.kiltz.kontakt.ws.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für art.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="art">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIVAT"/>
 *     &lt;enumeration value="BERUFLICH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "art")
@XmlEnum
public enum Art {

    PRIVAT,
    BERUFLICH;

    public String value() {
        return name();
    }

    public static Art fromValue(String v) {
        return valueOf(v);
    }

}
