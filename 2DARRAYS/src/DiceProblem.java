import java.util.Arrays;
import java.util.Random;
public class DiceProblem {
    public static void main(String[] args) {
        //Prints the 2D Array returned by Roll()
        System.out.println(Arrays.deepToString(Roll(4)));
    }

    public static int[][] Roll(int a) {
        //Create the 2D Array that will be returned
        int[][] x = new int[a][5];
        //a is the number of times we want to roll, and 5 is the number of dice we roll each time
        for(int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                Random rand = new Random();
                int k = rand.nextInt(6);
                x[i][j] = k + 1;
            }
            
        }
        return x;
        
    }
}
