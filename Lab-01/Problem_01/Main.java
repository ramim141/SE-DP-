
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // student s1 = new student("Ramim", 141, 3.6f);
        // student s2 = new student();

        // s1.display();
        // s2.display();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= count; i++) {

            System.out.println("Student : " + i);
            String name = sc.nextLine();
            int id = sc.nextInt();
            float cgpa = sc.nextFloat();

            student s = new student(name, id, cgpa);
            s.display();
            sc.nextLine();
        }

        sc.close();

    }
}
