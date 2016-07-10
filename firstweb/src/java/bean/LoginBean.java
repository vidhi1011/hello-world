package bean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Vidhi Dave
 */
public class LoginBean {  
private String email,psw;

    public LoginBean(String email, String psw) {
        this.email = email;
        this.psw = psw;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

  
  
}  