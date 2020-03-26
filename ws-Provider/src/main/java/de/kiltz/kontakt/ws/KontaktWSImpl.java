package de.kiltz.kontakt.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.ws.soap.Addressing;
import javax.xml.ws.soap.MTOM;

@WebService(name = "KontaktWS",
        targetNamespace = "http://ws.kontakt.kiltz.de/")
@Addressing(enabled=true, required=true)
@MTOM
public class KontaktWSImpl {

    @WebMethod(operationName="neu")
    public Kontakt neu(@WebParam(name="kontakt") Kontakt k){
        return null;
    }

    @WebMethod(operationName="hole")
    public Kontakt hole(@WebParam(name="id") Long id){
        return null;
    }

    @WebMethod(operationName="suche")
    public List<Kontakt> suche(@WebParam(name="such") String txt){
        return null;
    }


}
