FROM gradle:jdk17 as builder

ADD . /opt/
WORKDIR /opt/

RUN ls /opt && gradle clean build

FROM openjdk:19 as runner

COPY --from=builder /opt/config-server/build/libs/app.jar /opt/app.jar

CMD ["java", "-jar", "/opt/app.jar"]