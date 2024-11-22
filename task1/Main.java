
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
        

        int[] result = {0, 0};
        for(int j=0; j < size; j++){
            if(array[j] % 2 == 0){
                result[0]++;
            }
            else{
                result[1]++;
            }
        }
        
        

        System.out.println(MessageFormat.format("{0} - pair, {1} - not pair", result[0], result[1]));
    }
}