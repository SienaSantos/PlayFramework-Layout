package models;
import java.util.ArrayList;
import java.util.List;
import play.data.validation.Constraints;


public class loginModel{

  public String username;
  public String password;
  public String email;

  public loginModel() {
  }

  public loginModel(String email, String password, String username) {
    this.email = email;
    this.username = username;
    this.password = password;
  }
}
