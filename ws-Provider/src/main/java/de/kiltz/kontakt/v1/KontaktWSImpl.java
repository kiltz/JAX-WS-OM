package de.kiltz.kontakt.v1;

import javax.jws.WebService;

import de.kiltz.api.v2.AuthToken;


@WebService(serviceName = "KontaktService", portName = "KontaktPort",
        wsdlLocation = "META-INF/wsdl/de/kiltz/kontakt/v1/KontaktService.wsdl",
        targetNamespace = "http://kiltz.de/kontakt/v1")
public class KontaktWSImpl implements KontaktWS {


    @Override
    public NeuResponse neu(AuthToken auth, Neu body) throws KontaktException {
        return null;
    }

    @Override
    public HoleResponse hole(AuthToken auth, Hole body) throws KontaktException {
        return null;
    }

    @Override
    public SucheResponse suche(AuthToken auth, Suche body) throws KontaktException {
        return null;
    }
}
