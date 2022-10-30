FROM openjdk:20-jdk-buster as builder

ADD . /opt/
WORKDIR /opt/

RUN gradle clean build

FROM openjdk:19 as runner

COPY --from=builder /opt/build/libs/app.jar /opt/app.jar

CMD ["java", "-jar", "/opt/app.jar"]