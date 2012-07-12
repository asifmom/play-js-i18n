package controllers;

import play.*;
import play.mvc.*;
import jsmessages.JsMessages;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }
    public static Result jsMessages() {
        return ok(JsMessages.generate("VSP.Messages")).as("application/javascript");
    }
}