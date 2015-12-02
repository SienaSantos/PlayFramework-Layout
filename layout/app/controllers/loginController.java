package controllers;
import models.loginModel;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login.*;
import play.data.validation.Constraints;

import java.util.List;

public class loginController extends Controller {
  private static final Form<loginModel> loginForm = Form.form(loginModel.class);
  public String username;
  public String password;
  public String email;

  public static Result Login(){
  return ok(loginform.render(loginForm));
  }
  public static Result validate() {
    return TODO;
    /* if (authenticate(username, email, password) == null) {
      return "Invalid user or password";
    }
    return null;*/
}

  public static Result authenticate() {
      Form<loginModel> loginForm = Form.form(loginModel.class).bindFromRequest();
      if (loginForm.hasErrors()) {
      return badRequest(loginform.render(loginForm));
      }

      else {
          session().clear();
          session("email", loginForm.get().email);
          return redirect(routes.Application.index());
      }
  }


  public static Result details(String ean) {
  return TODO;
  }
  public static Result submit() {
  return TODO;
  }
}
