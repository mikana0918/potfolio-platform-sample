FROM openjdk:8-jdk-alpine
RUN addgroup -S interfacex && adduser -S mikana0918 -G interfacex
USER interfacex:mikana0918
# RUN pwd
WORKDIR /
# RUN pwd
ARG JAR_FILE=./build/libs//*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]