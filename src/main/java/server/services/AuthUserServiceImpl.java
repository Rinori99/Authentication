package server.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import server.models.AuthUser;
import server.repositories.AuthUserRepo;

import java.util.Collections;
import java.util.NoSuchElementException;

@Service
public class AuthUserServiceImpl implements AuthUserService {

    private AuthUserRepo authUserRepo;

    public AuthUserServiceImpl(AuthUserRepo authUserRepo) {
        this.authUserRepo = authUserRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AuthUser user = getUserByEmail(email);
        return new User(user.getId(), user.getPassword(), Collections.emptyList());
    }

    @Override
    public AuthUser getUserByEmail(String email) {
        AuthUser user = authUserRepo.findByEmail(email);
        if(user == null) {
            throw new NoSuchElementException("User not found!");
        }
        return user;
    }

    @Override
    public void saveAuthUser(String id, String email, String password) {
        authUserRepo.save(new AuthUser(id, email, password));
    }

}
