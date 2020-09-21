package bdtaskinformatics;

public class Driver {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected int age;

    public Driver(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "Driver" + "\n" + id + " " + firstName + " " + lastName + " " + age;
    }



}
