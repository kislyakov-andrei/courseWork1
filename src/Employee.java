import java.util.Objects;

public class Employee {

    private static int count = 1;
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private double salary;

    public Employee(String lastName, String firstName, String middleName, int department, double salary) {
        if (department > 0 && department <= 5) {
            this.id = count++;
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.department = department;
            this.salary = salary;
        } else {
            throw new RuntimeException("Введен некорректный номер отдела");
        }

    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ". " + lastName + " " + firstName + " " + middleName + ": отдел № " + department + ", З/п - " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Double.compare(salary, employee.salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, department, salary);
    }
}
