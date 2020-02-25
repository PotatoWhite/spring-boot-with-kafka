package me.potato.kafka.springbootwithkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfigs {
    @Bean
    public NewTopic createUsers() {
        return new NewTopic("users", 1, (short) 1);
    }
}
