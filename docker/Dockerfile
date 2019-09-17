FROM openjdk:8-jre-slim
ADD build/libs/oauth2-resource-server-only-*.jar /opt/oauth2-resource-server-only/
ENTRYPOINT java -jar /opt/oauth2-resource-server-only/oauth2-resource-server-only-*.jar
EXPOSE 8080