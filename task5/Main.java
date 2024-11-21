
import java.util.Random;
import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Array size: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        array[0] = 0;

        System.out.println("Rises(1) or Falls(2)? ");
        int rf = sc.nextInt();

        if(rf == 1){
            for(int i=1; i<size; i++){
                array[i] = r.nextInt(array[i-1], 100);
            }
        }
        else{
            for(int i=1; i<size; i++){
                array[i] = r.nextInt(-100, array[i-1]);
            }
        }

        System.out.println("Rises - " + (array[0] < array[1]));
    }
}