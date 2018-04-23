package people;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
  @Test
  public void Employee_toString_simple() {
    Employee e = new Employee("", "Mike", "Karels", "system architect", "commercial engineering");
    assertEquals("Mike () Karels\n\tcommercial engineering: system architect", e.toString());
  }
}