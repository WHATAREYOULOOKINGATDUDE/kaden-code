import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[4];
        for (int i = 0; i < 4; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();
        int[][] result = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = i; j > 0; j--) {
                result[i][j - 1] = result[i][j] + input[j - 1];
            }
            for (int j = i; j < 4; j++) {
                result[i][j + 1] = result[i][j] + input[j];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 4) {
                    System.out.print(result[i][j] + " ");
                } else {
                    System.out.println(result[i][j]);
                }
            }
        }
    }
}
// i = 2
// result[2][2] = 0;
// j = 2
// result[2][1] = result[2][2] + input[1] = 10

// i =2 j=1
// result[2][0] = result[2][i] + input[0] = 10 +3 = 13

/**
 * Sample Input
 * 3 10 12 5
 * Output for Sample Input
 * <p>
 * 0 3 13 25 30
 * 3 0 10 22 27
 * <p>
 * 13 10 0 12 17
 * <p>
 * 25 22 12 0 5
 * 30 27 17 5 0
 */