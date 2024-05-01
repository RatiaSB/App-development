package za.ac.cput;

public class Employee {
    String title;
    String firstName;
    String lastName;
    String empType;

    public Employee() {
    }

    public Employee(String title, String firstName, String lastName, String empType) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.empType = empType;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmpType() {
        return empType;
    }

    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empType='" + empType + '\'' +
                '}';
    }
    // method to write to file
    public void writeToFile(){

    }
}
