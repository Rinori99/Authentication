package server.DTOs;

public class PasswordRecoveredTransport {

    private String newPassword;

    public PasswordRecoveredTransport(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

}
