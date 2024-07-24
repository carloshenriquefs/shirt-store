# Imagem existente com uma jdk que servirá de base para o container
FROM openjdk:21-jdk-slim

# Usuario que está mantendo essa imagem
MAINTAINER github/carloshenriquefs

# Copiando o jar (programa buildado) para um diretório que será utilizado
COPY ./target/shirt-0.0.1-SNAPSHOT.jar /app/shirt-0.0.1-SNAPSHOT.jar

# Diretorio de trabalho, aonde quero que a aplicacao fique
WORKDIR /app

# Comando de inicializacao da aplicacao
ENTRYPOINT ["java", "-jar", "shirt-0.0.1-SNAPSHOT.jar"]

# Porta de exposicao do container
EXPOSE 8080
