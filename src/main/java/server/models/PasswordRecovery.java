package server.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "password_recovery")
public class PasswordRecovery {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private AuthUser userId;

    @Column(name = "date_time_requested")
    private Timestamp dateTimeRequested;

    @Column(name = "used")
    private boolean used;

    public PasswordRecovery() {}

    public PasswordRecovery(String id, AuthUser userId, Timestamp dateTimeRequested, boolean used) {
        this.id = id;
        this.userId = userId;
        this.dateTimeRequested = dateTimeRequested;
        this.used = used;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuthUser getUserId() {
        return userId;
    }

    public void setUserId(AuthUser userId) {
        this.userId = userId;
    }

    public Timestamp getDateTimeRequested() {
        return dateTimeRequested;
    }

    public void setDateTimeRequested(Timestamp dateTimeRequested) {
        this.dateTimeRequested = dateTimeRequested;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

}
