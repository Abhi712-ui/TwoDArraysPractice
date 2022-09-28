public class FindMinimumTest {
    public static void main(String[] args){
        int[][] x = new int[][]{{-22, 12, -33}, {33, 62, 21}, {54, 22, 45}};
        int index = 0; int Answer = 0; int Difference;
        int a = 0; int b = 0; int c = 0; int d = 0; int e = 0;
        for (int i = 0; i < x.length; i++){
            for (int k = 1; k < x.length; k++) {
                index+=k;
                for (int j = 0; j < x.length; j++) {
                    Difference = (x[i][index]-x[i][j]);
                    if (Difference < Answer) {
                        Answer = Math.abs(Difference);
                        b = i; c = j; d = i; e = index+1;
                    }
                }
                if (Answer > 0) {
                    a = Answer;
                }
                index = 0;
            }
        }
        System.out.println(a);
        System.out.println("[" + b + ", " + c + "]");
        System.out.println("[" + d + ", " + e + "]");

    }
}
