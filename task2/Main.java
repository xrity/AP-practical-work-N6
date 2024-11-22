
import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("num of Corners: ");
        int num = sc.nextInt();
        double corners[] = new double[num];
        double sum = 0;

        for(int i=0; i < num; i++){
            System.out.println(MessageFormat.format("Corner {0} value: ", i+1));
            corners[i] = sc.nextDouble();
            sum += corners[i];
        }

        if(sum == 180*(num-2)){
            System.out.println("Can be");
        }
        else{
            System.out.println("Cannot be");
        }
        
        System.out.println("");
    }
}