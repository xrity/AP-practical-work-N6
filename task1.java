import java.util.Scanner;

//23

public class task1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double lamb = 0.1;
    double b = 0.6;
    double c = 2.4 * Math.pow(10, -4);
    int t = 15;

    //x
    double x = Math.pow(Math.E, -lamb * b) * Math.cos(b);
    System.out.println("x = " + x);

    //y
    double y = b * Math.cos(t * Math.sqrt(b) + c);
    System.out.println("y = " + y);
  }
}
