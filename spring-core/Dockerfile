FROM gradle:jdk17 as builder

ADD ./spring-core/ /opt/
WORKDIR /opt/

RUN gradle clean build

FROM openjdk:19 as runner

COPY --from=builder /opt/spring-core/build/libs/app.jar /opt/app.jar

CMD ["java", "-jar", "/opt/app.jar"]