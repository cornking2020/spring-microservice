FROM openjdk:20-jdk-buster as builder

ADD . /opt/
WORKDIR /opt/

RUN ./gradlew clean build && ls /opt

FROM openjdk:19 as runner

COPY --from=builder /opt/build/libs/app.jar /opt/app.jar

CMD ["java", "-jar", "/opt/app.jar"]