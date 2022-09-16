import java.util.Scanner;

public class MagicSquare {

    static int n;

    static boolean isMagicSquare(int[][] mat)
    {
        int sumDiagonal1 = 0,sumDiagonal2=0;
        for (int i = 0; i < n; i++)
        {
            sumDiagonal1 += mat[i][i];
            sumDiagonal2 += mat[i][n-1-i];
        }
        if(sumDiagonal1 != sumDiagonal2)
            return false;

        for (int i = 0; i < n; i++) {

            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != colSum || colSum != sumDiagonal1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();


        int[][] mat = new int[n][n];


        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        if (isMagicSquare(mat))
            System.out.println("Magic Square");
        else
            System.out.println("Not a magic square");
    }
}
