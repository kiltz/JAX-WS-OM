
package de.kiltz.kontakt.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "suche", namespace = "http://ws.kontakt.kiltz.de/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suche", namespace = "http://ws.kontakt.kiltz.de/")
public class Suche {

    @XmlElement(name = "such", namespace = "")
    private String such;

    /**
     * 
     * @return
     *     returns String
     */
    public String getSuch() {
        return this.such;
    }

    /**
     * 
     * @param such
     *     the value for the such property
     */
    public void setSuch(String such) {
        this.such = such;
    }

}
