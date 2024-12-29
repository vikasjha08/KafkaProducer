
# Spring Boot Kafka Project
## Introduction
This project is a demonstration of a Spring Boot application integrated with Apache Kafka. It showcases message publishing and consumption capabilities using Kafka along with configurable application settings.
## Features
- Kafka Producer to send messages to a topic.
- Kafka Consumer to read messages from a topic using a consumer group.
- REST API to trigger Kafka message production.
- Kafka topic configuration using a Spring `@Configuration` class.
- Centralized configuration for Kafka properties and application constants.
## Project Structure
- **KafkaProducer**: A service that handles sending messages to the Kafka topic defined in the configuration.
- **KafkaConsumer**: A service that processes messages consumed from the Kafka topic.
- **KafkaController**: A REST controller providing endpoints to interact with the producer service.
- **Config**: A configuration class responsible for defining the Kafka topic.
- **`application.properties`**: Contains Kafka-related configuration (e.g., broker URL, topic name, serializers).
## Getting Started
## How to Run
1. Install and start Kafka on your local machine or connect to an external Kafka service.
2. Update the Kafka broker and topic information in `application.properties`.
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Start the Spring Boot application:
   ```
   mvn spring-boot:run
   ```
5. Use the REST endpoint to send messages to Kafka:
   - **Endpoint**: `GET /updateLocation`
   - **Effect**: Sends multiple random coordinate messages to the Kafka topic.

## API Endpoints
- **`GET /updateLocation`**: Sends 20,000 random coordinate messages to the configured Kafka topic.

## Technologies Used
- **Java** (JDK 23)
- **Spring Boot**
- **Apache Kafka**
- **Maven**

## Prerequisites
- JDK 23 or later
- Apache Kafka setup (locally or remotely configured)
- Maven for building the project

## Configuration
You can configure Kafka properties by setting values in the `application.properties` file. For example:
```properties
# Producer configuration
spring.kafka.producer.bootstrap.server=localhost:9092
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer

# Consumer configuration
spring.kafka.consumer.bootstrap.server=localhost:9092
spring.kafka.consumer.key-serializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-serializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.group-id=consumer-group-1

## Kafka Configuration
- The topic is automatically created at startup with the configuration provided in the `Config` class.
- **Topic Name**: Defined in `AppConstants.TOPIC_NAME`.

## Example Workflow
- Start the application.
- Request the endpoint `/updateLocation` to send a batch of messages to the Kafka topic.
- Observe the console logs where the consumer outputs the messages.

## Contribution
Contributions are welcome! Feel free to fork this repository and submit a pull request.

