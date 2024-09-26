import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Byte
    System.out.println("Type of data: byte");
    System.out.println("Size: " + Byte.SIZE + " bit");
    System.out.println("Min: " + Byte.MIN_VALUE);
    System.out.println("Max: " + Byte.MAX_VALUE);
    System.out.println();
    System.out.println("Write byte:");
    byte byteValue = Byte.parseByte(scanner.nextLine());
    System.out.println("Your byte: " + byteValue);
    System.out.println();

    // Short
    System.out.println("Type of data: short");
    System.out.println("Size: " + Short.SIZE + " bit");
    System.out.println("Min: " + Short.MIN_VALUE);
    System.out.println("Max: " + Short.MAX_VALUE);
    System.out.println();
    System.out.println("Write short:");
    short shortValue = Short.parseShort(scanner.nextLine());
    System.out.println("Your short: " + shortValue);
    System.out.println();

    // Int
    System.out.println("Type of data: int");
    System.out.println("Size: " + Integer.SIZE + " bit");
    System.out.println("Min: " + Integer.MIN_VALUE);
    System.out.println("Max: " + Integer.MAX_VALUE);
    System.out.println();
    System.out.println("Write int:");
    int intValue = Integer.parseInt(scanner.nextLine());
    System.out.println("Your int: " + intValue);
    System.out.println();

    // Long
    System.out.println("Type of data: long");
    System.out.println("Size: " + Long.SIZE + " bit");
    System.out.println("Min: " + Long.MIN_VALUE);
    System.out.println("Max: " + Long.MAX_VALUE);
    System.out.println();
    System.out.println("Write long:");
    long longValue = Long.parseLong(scanner.nextLine());
    System.out.println("Your long: " + longValue);
    System.out.println();

    // Float
    System.out.println("Type of data: float");
    System.out.println("Size: " + Float.SIZE + " bit");
    System.out.println("Min: " + Float.MIN_VALUE);
    System.out.println("Max: " + Float.MAX_VALUE);
    System.out.println();
    System.out.println("Write float:");
    float floatValue = Float.parseFloat(scanner.nextLine());
    System.out.println("Your float: " + floatValue);
    System.out.println();

    // Double
    System.out.println("Type of data: double");
    System.out.println("Size: " + Double.SIZE + " bit");
    System.out.println("Min: " + Double.MIN_VALUE);
    System.out.println("Max: " + Double.MAX_VALUE);
    System.out.println();
    System.out.println("Write double:");
    double doubleValue = Double.parseDouble(scanner.nextLine());
    System.out.println("Your double: " + doubleValue);
    System.out.println();

    // Char
    System.out.println("Type of data: char");
    System.out.println("Size: " + Character.SIZE + " bit");
    System.out.println("Min: " + (int) Character.MIN_VALUE);
    System.out.println("Max: " + (int) Character.MAX_VALUE);
    System.out.println();
    System.out.println("Write char:");
    char charValue = scanner.nextLine().charAt(0);
    System.out.println("Your char: " + charValue);
    System.out.println();

    // Boolean
    System.out.println("Type of data: boolean");
    System.out.println("Size: 1 bit");
    System.out.println("Possible values: " + Boolean.FALSE + " and " + Boolean.TRUE);
    System.out.println();
    System.out.println("Write boolean:");
    boolean booleanValue = Boolean.parseBoolean(scanner.nextLine());
    System.out.println("Your boolean: " + booleanValue);
  }
}
