FROM eclipse-temurin:17-jdk-alpine AS builder

WORKDIR /app
COPY . /app
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

ENV KEYCLOAK_ISSUER_URI=http://host.docker.internal:8080/realms/data-integration-realm
ENV LEGACY_SYSTEM_DB_URL=jdbc:oracle:thin:@host.docker.internal:1521/XEPDB1
ENV LEGACY_SYSTEM_DB_USERNAME=datainteg
ENV LEGACY_SYSTEM_DB_PASSWORD=datainteg

COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]
