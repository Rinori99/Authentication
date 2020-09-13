package server.integration.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueuesConfiguration {

    @Value("${queue.user.new.general}")
    private String newGeneralUserQueueName;

    @Bean(name = "newGeneralUserQueue")
    public Queue newGeneralUserQueue() {
        return new Queue(newGeneralUserQueueName);
    }

}
