package server.integration.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public final class UserCredentials implements Serializable {

    private final String id;
    private final String email;
    private final String password;

    public UserCredentials(@JsonProperty("id") String id,
                           @JsonProperty("email") String email,
                           @JsonProperty("password") String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserCredentials{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
