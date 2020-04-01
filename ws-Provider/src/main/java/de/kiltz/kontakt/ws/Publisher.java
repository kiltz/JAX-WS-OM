package de.kiltz.kontakt.v1;

import javax.xml.ws.Endpoint;

import de.kiltz.kontakt.ws.KontaktWSImpl;
import de.kiltz.kontakt.ws.v1.KontaktWS;

/**
 * Publischer als Tomcat oder Application-Server Ersatz.
 * Recht zum Testen ;-)
 *
 * @author fk
 *
 */
public class Publisher {

    private final static String ADRESSE = "http://localhost:9090/ws/Kontakt_1";
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Starte endpoint unter: "+ADRESSE );
        System.out.println("Die WSDL gibt es unter: "+ADRESSE+"?wsdl" );

        KontaktWS k = new KontaktWSImpl();

        Endpoint.publish(ADRESSE, k);

    }

}
