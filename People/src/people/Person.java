package people;

public class Person {
  String givenName;
  String preferredName;
  String familyName;

  public Person(String givenName, String preferredName, String familyName) {
    this.givenName = givenName;
    this.preferredName = preferredName;
    this.familyName = familyName;
  }

  public Person() {
    this.givenName = "";
    this.preferredName = "";
    this.familyName = "";
  }

  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  @Override
  public String toString() {
    // Overly simplified...
    return preferredName + " (" + givenName + ") " + familyName;
  }
}
