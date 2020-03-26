rm -rf src/generated
mkdir -p src/generated/resources
mkdir -p src/generated/java


wsgen -cp build/classes/java/main/ -d build/classes/java/main/ -r src/generated/resources -s src/generated/java -keep -wsdl -servicename "{http://ws.kontakt.kiltz.de/}KontaktService" -portname "{http://ws.kontakt.kiltz.de/}KontaktWS" de.kiltz.kontakt.ws.KontaktWSImpl