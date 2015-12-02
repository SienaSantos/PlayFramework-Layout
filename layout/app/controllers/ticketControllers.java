package controllers;
import models.ticketModel;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.tickets.*;

import java.util.List;

public class ticketControllers extends Controller {
  private static final Form<ticketModel> ticketForm = Form.form(ticketModel.class);

  public static Result newTicket(){
  return ok(ticketform.render(ticketForm));
  }
  public static Result details(String ean) {
  return TODO;
  }
  public static Result save() {
  return TODO;
  }
}
