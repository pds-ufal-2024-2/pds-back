# Etapa 1: Build
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

RUN mkdir -p /app/sqlite

RUN touch /app/database.db

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
