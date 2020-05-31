package server.integration.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import server.integration.models.UserCredentials;
import server.services.AuthUserService;

@Service
public class UserConsumer {

//    private AuthUserService authUserService;
//
//    public UserConsumer(AuthUserService authUserService) {
//        this.authUserService = authUserService;
//    }
//
//    @RabbitListener(queues = {"${queue.user.new.student}", "${queue.user.new.teacher}", "${queue.user.new.parent}",
//            "${queue.user.new.admin}"})
//    public void handleNewUserReception(UserCredentials userCredentials) {
//        authUserService.saveAuthUser(userCredentials.getId(), userCredentials.getEmail(), userCredentials.getPassword());
//    }

}
