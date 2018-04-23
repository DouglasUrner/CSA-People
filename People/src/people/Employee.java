package people;

public class Employee extends Person {
  String jobTitle;
  String department;

  public Employee(String givenName, String preferredName, String familyName, String jobTitle, String department) {
    super(givenName, preferredName, familyName);
    this.jobTitle = jobTitle;
    this.department = department;
  }

  @Override
  public String toString() {
    return super.toString() + "\n\t" + department + ": " + jobTitle;
  }
}
