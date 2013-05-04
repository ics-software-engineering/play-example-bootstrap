package controllers;

import static play.data.Form.form;
import models.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * The controller supporting two actions. Display shows the index page without the results of any
 * prior form submission. Submit processes the form submission from the index page and shows the
 * results through a redisplay of the index page.
 * 
 * @author Philip Johnson
 */
public class Application extends Controller {
  public static Form<Person> personForm = form(Person.class);

  /**
   * @return The index page upon initial display. No prior data.
   */
  public static Result display() {
    return ok(index.render(personForm, "(None)", "(None)"));
  }

  /**
   * @return The index page after processing a submission.
   */
  public static Result submit() {
    Person person = form(Person.class).bindFromRequest().get();
    return ok(index.render(personForm, person.name, person.gender));
  }

}
