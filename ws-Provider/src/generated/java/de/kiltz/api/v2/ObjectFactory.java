
package de.kiltz.api.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.kiltz.api.v2 package. 
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

    private final static QName _FaultInfo_QNAME = new QName("http://kiltz.de/api/v2", "FaultInfo");
    private final static QName _AuthToken_QNAME = new QName("http://kiltz.de/api/v2", "AuthToken");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.kiltz.api.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link AuthToken }
     * 
     */
    public AuthToken createAuthToken() {
        return new AuthToken();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/api/v2", name = "FaultInfo")
    public JAXBElement<FaultInfo> createFaultInfo(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_FaultInfo_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kiltz.de/api/v2", name = "AuthToken")
    public JAXBElement<AuthToken> createAuthToken(AuthToken value) {
        return new JAXBElement<AuthToken>(_AuthToken_QNAME, AuthToken.class, null, value);
    }

}
