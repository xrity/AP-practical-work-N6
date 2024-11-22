import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double matrix[][] = new double[10][10];

        double k = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(k <= 90){
                    matrix[i][j] = Math.sin(Math.toRadians(k++));
                }
                else{
                    matrix[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
