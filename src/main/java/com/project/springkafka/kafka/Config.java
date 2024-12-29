package com.project.springkafka.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.project.springkafka.constants.AppConstants.TOPIC_NAME;

@Configuration
public class Config {

    /**
     * Defines a Kafka topic bean for creating a topic with the specified name.
     * The topic is configured with default partition and replication settings.
     *
     * @return a NewTopic object representing the Kafka topic configuration
     * <p>
     * you can create another consumer with same group
     * id to check that one message is consumed only once within same consumer groups
     */
    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(TOPIC_NAME)
                //.partitions(2)

                //.replicas(1)
                .build();
    }


}
