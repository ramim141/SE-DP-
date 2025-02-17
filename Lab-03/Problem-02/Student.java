public class Student extends Person implements InstitutionMember {
    private String Role;

    public Student(String name, int age, String Role) {
        super(name, age);
        this.Role = Role;
    }

    // setter
    public void setRole(String Role) {
        this.Role = Role;
    }

    // getter
    public String getRole() {
        return this.Role;
    }

    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Role: " + getRole();
    }
}