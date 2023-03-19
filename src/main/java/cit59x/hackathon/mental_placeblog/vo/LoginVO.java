package cit59x.hackathon.mental_placeblog.vo;

import lombok.Data;

/**
 * Value object for login and register.
 */
@Data
public class LoginVO {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
