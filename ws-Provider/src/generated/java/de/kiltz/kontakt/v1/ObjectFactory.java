
package de.kiltz.kontakt.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.kiltz.kontakt.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Suche_QNAME = new QName("http://kiltz.de/kontakt/v1", "Suche");
    private final static QName _Hole_QNAME = new QName("http://kiltz.de/kontakt/v1", "Hole");
    private final static QName _HoleResponse_QNAME = new QName("http://kiltz.de/kontakt/v1", "HoleResponse");
    private final static QName _Neu_QNAME = new QName("http://kiltz.de/kontakt/v1", "Neu");
    private final static QName _NeuResponse_QNAME = new QName("http://kiltz.de/kontakt/v1", "NeuResponse");
    private final static QName _SucheResponse_QNAME = new QName("http://kiltz.de/kontakt/v1", "SucheResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.kiltz.kontakt.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HoleReq }
     * 
     */
    public HoleReq createHoleReq() {
        return new HoleReq();
    }

    /**
     * Create an instance of {@link SucheReq }
     * 
     */
    public SucheReq createSucheReq() {
        return new SucheReq();
    }

    /**
     * Create an instance of {@link SucheResp }
     * 
     */
    public SucheResp createSucheResp() {
        return new SucheResp();
    }

    /**
     * Create an instance of {@link HoleResp }
     * 
     */
    public HoleResp createHoleResp() {
        return new HoleResp();
    }

    /**
     * Create an instance of {@link NeuReq }
     * 
     */
    public NeuReq createNeuReq() {
        return new NeuReq();
    }

    /**
     * Create an instance of {@link NeuResp }
     * 
     */
    public NeuResp createNeuResp() {
        return new NeuResp();
    }

    /**
     * Create an instance of {@link Kontakt }
     * 
     */
    public Kontakt createKontakt() {
        return new Kontakt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SucheReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "Suche")
    public JAXBElement<SucheReq> createSuche(SucheReq value) {
        return new JAXBElement<SucheReq>(_Suche_QNAME, SucheReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoleReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "Hole")
    public JAXBElement<HoleReq> createHole(HoleReq value) {
        return new JAXBElement<HoleReq>(_Hole_QNAME, HoleReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoleResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "HoleResponse")
    public JAXBElement<HoleResp> createHoleResponse(HoleResp value) {
        return new JAXBElement<HoleResp>(_HoleResponse_QNAME, HoleResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "Neu")
    public JAXBElement<NeuReq> createNeu(NeuReq value) {
        return new JAXBElement<NeuReq>(_Neu_QNAME, NeuReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "NeuResponse")
    public JAXBElement<NeuResp> createNeuResponse(NeuResp value) {
        return new JAXBElement<NeuResp>(_NeuResponse_QNAME, NeuResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SucheResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "SucheResponse")
    public JAXBElement<SucheResp> createSucheResponse(SucheResp value) {
        return new JAXBElement<SucheResp>(_SucheResponse_QNAME, SucheResp.class, null, value);
    }

}
