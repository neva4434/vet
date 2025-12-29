package people;

public abstract class Employee extends Person {
    protected String department;

    public Employee(String id, String name, String email, String password, String department) {
        super(id, name, email, password);
        this.department = department;
    }
}

