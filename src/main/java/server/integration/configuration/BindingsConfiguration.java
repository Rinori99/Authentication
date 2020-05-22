package server.integration.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BindingsConfiguration {

    @Value("${binding.user.new.general}")
    private String newUserGeneralBindingKey;

    @Bean
    public Binding bindTopicExchangeToNewStudentsQueue(@Qualifier("newStudentsQueue") Queue newStudentsQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(newStudentsQueue).to(topicExchange).with(newUserGeneralBindingKey);
    }

    @Bean
    public Binding bindTopicExchangeToNewParentsQueue(@Qualifier("newParentsQueue") Queue newParentsQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(newParentsQueue).to(topicExchange).with(newUserGeneralBindingKey);
    }

    @Bean
    public Binding bindTopicExchangeToNewTeachersQueue(@Qualifier("newTeachersQueue") Queue newTeachersQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(newTeachersQueue).to(topicExchange).with(newUserGeneralBindingKey);
    }

    @Bean
    public Binding bindTopicExchangeToNewAdminsQueue(@Qualifier("newAdminsQueue") Queue newAdminsQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(newAdminsQueue).to(topicExchange).with(newUserGeneralBindingKey);
    }

}
