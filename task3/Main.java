import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Array size: ");
        int size = sc.nextInt();
        int array[] = new int[size];


        int i = size;
        while(i-- > 0){
            array[i] = r.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(array) + " - Array");
        

        System.out.println("Element value: ");
        int target = sc.nextInt();

        System.out.println("New value: ");
        int value = sc.nextInt();


        for(int j=0; j<size; j++){
            if(array[j] == target){
                array[j] = value;
            }
        }
        System.out.println(Arrays.toString(array) + " - Array");
    }
}