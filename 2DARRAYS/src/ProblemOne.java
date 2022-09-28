import java.lang.Math;
public class ProblemOne {
    public static void main(String[] args) {
        int[][] x = {
        {-22, 12, -33},
        {33, 62, 21},
        {54, 487, 42}
    };
    FindMinimum(x);
    }

    public static void FindMinimum(int[][] x) {
        int index = 0;
        int Answer = 0;
        int Difference;
        int zed = 0;
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        for (int a= 0;a < x.length; a++)
        {
            for (int b = 1; b < x.length; b++) {
                index+=b;
                for (int j = 0; j< x.length; j++) {
                    Difference = (x[a][index]-x[a][j]);
                    if (Difference < Answer) {
                        Answer = Math.abs(Difference);
                        uno = a;
                        dos = j;
                        tres = a;
                        cuatro = index+1;
                    }

                }
                if (Answer > 0) {
                    zed = Answer;
                }
                index = 0;
                
            }
        }
        System.out.println(zed);
        System.out.println("[" + uno + ", " + dos+ "]");
        System.out.println("[" + tres + ", " + cuatro + "]");
    }
    
}
