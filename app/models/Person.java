package models;

import java.util.ArrayList;
import java.util.List;
import play.db.ebean.Model;

/**
 * Simple model class used for form data retrieval.
 * @author Philip Johnson
 */
public class Person extends Model {
  private static final long serialVersionUID = -2206212996405933705L;
  public String name;
  public String gender;
  
  public static List<String> getGenders() {
    List<String> genders = new ArrayList<>();
    genders.add("Male");
    genders.add("Female");
    return genders;
  }
}
