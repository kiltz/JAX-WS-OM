
package de.kiltz.kontakt.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sucheResponse", namespace = "http://ws.kontakt.kiltz.de/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sucheResponse", namespace = "http://ws.kontakt.kiltz.de/")
public class SucheResponse {

    @XmlElement(name = "return", namespace = "")
    private List<de.kiltz.kontakt.ws.Kontakt> _return;

    /**
     * 
     * @return
     *     returns List<Kontakt>
     */
    public List<de.kiltz.kontakt.ws.Kontakt> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<de.kiltz.kontakt.ws.Kontakt> _return) {
        this._return = _return;
    }

}
