import java.util.Scanner;

//23

public class task2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("a = ");
    double a = scanner.nextDouble();
    System.out.println("b = ");
    double b = scanner.nextDouble();
    System.out.println("x = ");
    double x = scanner.nextDouble();
    double result = 0;

    if (x<9) {
      result = Math.abs(a * x + 7);
    } else if (x >= 9 && x < 15) {
      result = 5 * Math.sqrt(b * x + 1);
    } else if (x == 15){
      result = Math.sin(x);
    }
    
    System.out.println("result = " + result);
  }
}
