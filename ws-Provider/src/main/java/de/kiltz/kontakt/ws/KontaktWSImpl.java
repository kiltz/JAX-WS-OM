package de.kiltz.kontakt.ws;

import java.util.List;

import javax.jws.WebService;

import de.kiltz.kontakt.ws.v1.Kontakt;
import de.kiltz.kontakt.ws.v1.KontaktWS;

@WebService(name = "KontaktWS",
        targetNamespace = "http://ws.kontakt.kiltz.de/")

public class KontaktWSImpl implements KontaktWS {


    @Override
    public List<Kontakt> suche(String such) {
        return null;
    }

    @Override
    public Kontakt hole(Long id) {
        return null;
    }

    @Override
    public Kontakt neu(Kontakt kontakt) {
        return null;
    }
}
