import java.util.Scanner;
//https://cccgrader.com/getproblem.php?fid=221007&authcode=29b8d4570578539945eefff14aefd96c
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int points = 100;
        int points2 = 100;

        for (int i = 0; i < size; i++) {
            int pointsRoll = sc.nextInt();
            int pointsRoll2 = sc.nextInt();

            if (pointsRoll < pointsRoll2) {
                points -= pointsRoll2;
            } else if (pointsRoll2 < pointsRoll) {
                points2 -= pointsRoll;
            }
        }

        System.out.println(points);
        System.out.println(points2);
    }
}
