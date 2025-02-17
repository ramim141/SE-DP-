import java.util.*;

public class Main {
  public static void main(String[] args) {

    Pyramid pyramid = new Pyramid();
    pyramid.printPyramid(5);

    even_odd p1 = new even_odd();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    p1.printPyramid(num);

    // bubble_sort b1 = new bubble_sort();

  }
}
