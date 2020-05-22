package server.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import server.models.AuthUser;

public interface AuthUserService extends UserDetailsService {

    AuthUser getUserByEmail(String email);

    void saveAuthUser(String id, String email, String password);

}
