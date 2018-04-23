package people;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
  @Test
  public void Person_Constructor_withThreedNames() {
    Person p = new Person("William", "Bill", "Joy");
    assertEquals("William", p.givenName);
    assertEquals("Bill", p.preferredName);
    assertEquals("Joy", p.familyName);
  }

  @Test
  public void Person_Constructor_withPreferredNameWithoutGivenName() {
    Person p = new Person("", "Lynn", "Conway");
    assertEquals("", p.givenName);
    assertEquals("Lynn", p.preferredName);
    assertEquals("Conway", p.familyName);
  }

  @Test
  public void Person_Constructor_withGivenNameWithoutPreferredName() {
    Person p = new Person("Alan", "", "Turing");
    assertEquals("Alan", p.givenName);
    assertEquals("", p.preferredName);
    assertEquals("Turing", p.familyName);
  }

  @Test
  public void Person_Constructor_GivenNameOnly() {
    Person p = new Person("Fureigh", "", "");
    assertEquals("Fureigh", p.givenName);
    assertEquals("", p.preferredName);
    assertEquals("", p.familyName);
  }

  @Test
  public void Person_Constructor_PreferredNameOnly() {
    Person p = new Person("", "Fureigh", "");
    assertEquals("", p.givenName);
    assertEquals("Fureigh", p.preferredName);
    assertEquals("", p.familyName);
  }

  @Test
  public void Person_Constructor_FamilyNameOnly() {
    Person p = new Person("", "", "Fureigh");
    assertEquals("", p.givenName);
    assertEquals("", p.preferredName);
    assertEquals("Fureigh", p.familyName);
  }

  @Test
  public void getGivenName() {
    Person p = new Person("Mark", "", "Horton");
    assertEquals("Mark", p.getGivenName());
  }

  @Test
  public void setGivenName() {
    Person p = new Person("Mark", "", "Horton");
    p.setGivenName("Mary Ann");
    assertEquals("Mary Ann", p.givenName);
  }

  @Test
  public void getPreferredName() {
    Person p = new Person("Edith", "", "Windsor");
    assertEquals("", p.getPreferredName());
  }

  @Test
  public void setPreferredName() {
    Person p = new Person("Edith", "", "Windsor");
    p.setPreferredName("Edie");
    assertEquals("Edie", p.preferredName);
  }

  @Test
  public void getFamilyName() {
    Person p = new Person("Katherine", "", "Coleman");
    assertEquals("Coleman", p.getFamilyName());
  }

  @Test
  public void setFamilyName() {
    Person p = new Person("Katherine", "", "Coleman");
    p.setFamilyName("Johnson");
    assertEquals("Johnson", p.familyName);
  }

  @Test
  public void Person_toString_simple() {
    Person p = new Person("Augusta", "Ada", "Lovelace");
    assertEquals("Ada (Augusta) Lovelace", p.toString());
  }

/*  @Test
  public void Person_toString_hasPreferredName() {
  }

  @Test
  public void Person_toString_noPreferredName() {
  }

  @Test
  public void Person_toString_onlyGivenName() {
  }
  
  @Test
  public void Person_toString_onlyFamilyName() {
  }*/
}