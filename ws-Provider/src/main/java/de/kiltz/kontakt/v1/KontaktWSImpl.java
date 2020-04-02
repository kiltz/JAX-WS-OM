package de.kiltz.kontakt.v1;

import javax.jws.WebService;

import de.kiltz.api.v2.AuthToken;


@WebService(serviceName = "KontaktService", portName = "KontaktPort",
        wsdlLocation = "META-INF/wsdl/de/kiltz/kontakt/v1/KontaktService.wsdl",
        targetNamespace = "http://kiltz.de/kontakt/v1")
public class KontaktWSImpl implements KontaktWS {


    @Override
    public NeuResp neu(AuthToken auth, NeuReq body) throws KontaktException {
        return null;
    }

    @Override
    public HoleResp hole(AuthToken auth, HoleReq body) throws KontaktException {
        return null;
    }

    @Override
    public SucheResp suche(AuthToken auth, SucheReq body) throws KontaktException {
        return null;
    }
}
