
package de.kiltz.kontakt.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für sucheResp complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="sucheResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kontaktListe" type="{http://kiltz.de/kontakt/v1}kontakt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sucheResp", propOrder = {
    "kontaktListe"
})
public class SucheResp {

    protected List<Kontakt> kontaktListe;

    /**
     * Gets the value of the kontaktListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kontaktListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKontaktListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kontakt }
     * 
     * 
     */
    public List<Kontakt> getKontaktListe() {
        if (kontaktListe == null) {
            kontaktListe = new ArrayList<Kontakt>();
        }
        return this.kontaktListe;
    }

}
