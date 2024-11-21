import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        double matrix[][] = new double[9][10];

        double k = 0;
        for(int i=0; i < 11; i++){
            for(int j=0; j < 10; j++){
                matrix[i][j] = Math.sin(k++);
            }
            System.out.println(Arrays.toString(matrix[i]));
        }     
    }
}