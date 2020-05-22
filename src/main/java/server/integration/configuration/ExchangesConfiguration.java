package server.integration.configuration;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangesConfiguration {

    @Value("${exchange.topic}")
    private String topicExchange;

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(topicExchange);
    }

}
