FROM adoptopenjdk/openjdk11:latest

COPY ./target/produits.jar /usr/app/

WORKDIR /usr/app


ENTRYPOINT ["java","-jar","/usr/app/produits.jar"]
