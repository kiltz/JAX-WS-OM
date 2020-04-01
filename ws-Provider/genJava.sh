rm -rf src/generated
mkdir -p src/generated/java

wsimport -d build/classes/java/main/ -s src/generated/java -keep -extension src/main/resources/META-INF/wsdl/de/kiltz/kontakt/v1/KontaktService.wsdl