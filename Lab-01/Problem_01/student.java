
public class student {
    private String name;
    private int id;
    private float CGPA;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCGPA() {
        return CGPA;
    }
    
    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }
    public student() {
        this.name = "Pamel";
        this.id = 142;
        this.CGPA = 3.5f;

    }
   

    public student(String name, int id, float CGPA) {
        this.name = name;
        this.id = id;
        this.CGPA = CGPA;
    }

    public void display() {
        System.out.println("Name : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("CGPA : " + getCGPA());
    }
}
