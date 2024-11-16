
import java.text.MessageFormat;
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
        

        int[] result = new int[2];
        if(array.length % 2 == 0){
            result[0] = size/2;
            result[1] = result[0];
        }
        else{
            size--;
            result[0] = size/2;
            result[1] = size/2 + 1;
            size++;
        }
        

        System.out.println(MessageFormat.format("{0} - pair, {1} - not pair", result[0], result[1]));
    }
}