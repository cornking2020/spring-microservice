FROM gradle:jdk17 as builder

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src

RUN gradle clean build -x test --no-daemon

FROM openjdk:19 as runner

COPY --from=builder /home/gradle/src/build/libs/app.jar /opt/app.jar

CMD ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/opt/app.jar"]