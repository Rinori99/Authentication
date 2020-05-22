package server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.models.AuthUser;

@Repository
public interface AuthUserRepo extends JpaRepository<AuthUser, String> {

    AuthUser findByEmail(String email);

}
