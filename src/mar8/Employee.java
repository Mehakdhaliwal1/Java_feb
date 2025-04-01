package mar8;

public class Employee {
    String id;
    String position;
    String salary;

    public Employee(String id, String position, String salary) {
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
