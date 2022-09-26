import java.lang.Math;
import java.util.Arrays;
public class ProblemOne {
    public static void main(String[] args) {
        int[][] x = {
        {-22, 12, -33},
        {33, 62, 21},
        {54, 22, 42}
    };
    FindMinimum(x);
    }

    public static void FindMinimum(int[][] x) {
        int[] differences = new int[x.length];
        String[] indexes = new String[x.length];

        for (int i = 0; i < differences.length; i++) {
            int j; int k; int l;
            j = x[i][1];
            k = Math.abs( j - x[i][0]);
            l = Math.abs( j - x[i][2]);

            if( k <= l){
                differences[i] = k;
                indexes[i] = (i + "," + 1 + " and " + i + "," + 0);
            }
            else{
                differences[i] = l;
                indexes[i] = (i + "," + 1 + " and " + i + "," + 2);
            }

        }

        int min = differences[0];
        String minindexes = indexes[0];  
        for (int i = 0; i < differences.length; i++) {  
           if(differences[i] <min)  
               min = differences[i];
               minindexes = indexes[i];
        }  
      int Smallest = min;    

        System.out.println("The Smallest Difference is " + Smallest + " and the indexes are " + minindexes);
    }
    
}
