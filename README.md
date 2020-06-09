## Gerar o .jar
sudo ./mvnw package && java -jar target/demo-0.1.0.jar

## Buildar a imagem docker
docker build -t demo-java-docker .

## Subir o container
 docker run -p 3000:3000 -d --name demo-java-docker  demo-java-docker
