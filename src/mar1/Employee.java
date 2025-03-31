package mar1;

public class Employee {
    String id;
    String name;
    String email;
    static String Company = "Antek";

    public Employee(String id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }
    public void printDetails(){
        System.out.println(id);
        System.out.println(email);
        System.out.println(name);
        System.out.println(Company);
    }

}
