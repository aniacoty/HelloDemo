package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Byl sobie raz chlopczyk i byl on tak glodny ze zjadl wszystkie polskie litery"));
    }
  
}