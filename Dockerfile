FROM openjdk:latest

COPY target/trinkspielplatz-0.0.1-SNAPSHOT.jar trinkspielplatz.jar

EXPOSE $PORT

ENTRYPOINT ["java","-jar","trinkspielplatz.jar"]