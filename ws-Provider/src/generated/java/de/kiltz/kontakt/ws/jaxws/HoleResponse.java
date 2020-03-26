
package de.kiltz.kontakt.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "holeResponse", namespace = "http://ws.kontakt.kiltz.de/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "holeResponse", namespace = "http://ws.kontakt.kiltz.de/")
public class HoleResponse {

    @XmlElement(name = "return", namespace = "")
    private de.kiltz.kontakt.ws.Kontakt _return;

    /**
     * 
     * @return
     *     returns Kontakt
     */
    public de.kiltz.kontakt.ws.Kontakt getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(de.kiltz.kontakt.ws.Kontakt _return) {
        this._return = _return;
    }

}
