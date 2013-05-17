package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.data.validation.Constraints.*;

import java.util.*;

import views.html.*;

public class Application extends Controller {
    public static class Kitchen {
        @Required public String name;
        public String choice;
    }

    public static Result index() {
        return ok(index.render(form(Kitchen.class)));
    }

    public static Result doIt() {
        Form<Kitchen> form = form(Kitchen.class).bindFromRequest();
        if(form.hasErrors()) {
            return badRequest(index.render(form));
        } else {
            Kitchen data = form.get();
            return ok(
                    kitchen.render(data.name, data.choice)
            );
        }
    }
  
}