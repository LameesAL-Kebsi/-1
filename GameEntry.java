//Q2
public class GameEntry {
    int score;





    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[7];
        GameEntry[] B = new GameEntry[7];


        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry();
        }


        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        A[4].score = 550;


        System.out.println(B[4].score);
    }
}
