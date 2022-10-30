FROM gradle:jdk17 as builder

ADD ./config-server/ /opt/
WORKDIR /opt/

RUN gradle clean build && ls /opt

FROM openjdk:19 as runner

COPY --from=builder /opt/config-server/build/libs/app.jar /opt/app.jar

CMD ["java", "-jar", "/opt/app.jar"]