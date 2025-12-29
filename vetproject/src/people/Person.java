package people;

public abstract class Person {
    private String id;
    private String name;
    private String email;
    private String password;

    public Person(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public boolean checkPassword(String input) {
        return password.equals(input);
    }

    // POLYMORPHISM
    public abstract void showRole();
}
