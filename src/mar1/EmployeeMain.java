package mar1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("101","mehak@gmail.com","mehak");
        Employee employee2 = new Employee("102","taran@gmail.com","taran");
        Employee employee3 = new Employee("103","jyoti@gmail.com","Jyoti");

        employee1.printDetails();
        System.out.println();
        employee2.printDetails();
        System.out.println();
        employee3.printDetails();
    }
}
