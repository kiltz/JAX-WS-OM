
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

    private final static QName _Suche_QNAME = new QName("http://kiltz.de/kontakt/v1", "suche");
    private final static QName _Hole_QNAME = new QName("http://kiltz.de/kontakt/v1", "hole");
    private final static QName _HoleResponse_QNAME = new QName("http://kiltz.de/kontakt/v1", "holeResponse");
    private final static QName _Neu_QNAME = new QName("http://kiltz.de/kontakt/v1", "neu");
    private final static QName _NeuResponse_QNAME = new QName("http://kiltz.de/kontakt/v1", "neuResponse");
    private final static QName _SucheResponse_QNAME = new QName("http://kiltz.de/kontakt/v1", "sucheResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.kiltz.kontakt.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hole }
     * 
     */
    public Hole createHole() {
        return new Hole();
    }

    /**
     * Create an instance of {@link HoleResponse }
     * 
     */
    public HoleResponse createHoleResponse() {
        return new HoleResponse();
    }

    /**
     * Create an instance of {@link Suche }
     * 
     */
    public Suche createSuche() {
        return new Suche();
    }

    /**
     * Create an instance of {@link NeuResponse }
     * 
     */
    public NeuResponse createNeuResponse() {
        return new NeuResponse();
    }

    /**
     * Create an instance of {@link SucheResponse }
     * 
     */
    public SucheResponse createSucheResponse() {
        return new SucheResponse();
    }

    /**
     * Create an instance of {@link Neu }
     * 
     */
    public Neu createNeu() {
        return new Neu();
    }

    /**
     * Create an instance of {@link Kontakt }
     * 
     */
    public Kontakt createKontakt() {
        return new Kontakt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suche }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "suche")
    public JAXBElement<Suche> createSuche(Suche value) {
        return new JAXBElement<Suche>(_Suche_QNAME, Suche.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "hole")
    public JAXBElement<Hole> createHole(Hole value) {
        return new JAXBElement<Hole>(_Hole_QNAME, Hole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "holeResponse")
    public JAXBElement<HoleResponse> createHoleResponse(HoleResponse value) {
        return new JAXBElement<HoleResponse>(_HoleResponse_QNAME, HoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Neu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "neu")
    public JAXBElement<Neu> createNeu(Neu value) {
        return new JAXBElement<Neu>(_Neu_QNAME, Neu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "neuResponse")
    public JAXBElement<NeuResponse> createNeuResponse(NeuResponse value) {
        return new JAXBElement<NeuResponse>(_NeuResponse_QNAME, NeuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SucheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/kontakt/v1", name = "sucheResponse")
    public JAXBElement<SucheResponse> createSucheResponse(SucheResponse value) {
        return new JAXBElement<SucheResponse>(_SucheResponse_QNAME, SucheResponse.class, null, value);
    }

}
