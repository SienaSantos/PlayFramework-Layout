package controllers;
import models.Product;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.products.*;

import java.util.List;

public class Products extends Controller {
  private static final Form<Product> productForm = Form.form(Product.class);

  public static Result list() {
  List<Product> products = Product.findAll();
  return ok(list.render(products));
  }
  // public static Result newProduct() {
  // return TODO;
  // }
  public static Result newProduct(){
  return ok(details.render(productForm));
  }
  public static Result details(String ean) {
  return TODO;
  }
  public static Result save() {
  return TODO;
  }
}
