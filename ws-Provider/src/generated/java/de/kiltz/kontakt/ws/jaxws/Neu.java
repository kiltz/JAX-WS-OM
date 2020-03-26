
package de.kiltz.kontakt.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "neu", namespace = "http://ws.kontakt.kiltz.de/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "neu", namespace = "http://ws.kontakt.kiltz.de/")
public class Neu {

    @XmlElement(name = "kontakt", namespace = "")
    private de.kiltz.kontakt.ws.Kontakt kontakt;

    /**
     * 
     * @return
     *     returns Kontakt
     */
    public de.kiltz.kontakt.ws.Kontakt getKontakt() {
        return this.kontakt;
    }

    /**
     * 
     * @param kontakt
     *     the value for the kontakt property
     */
    public void setKontakt(de.kiltz.kontakt.ws.Kontakt kontakt) {
        this.kontakt = kontakt;
    }

}
