import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//https://cccgrader.com/getproblem.php?fid=220944&authcode=fa89fd8de8b4d71b9aa2f016c6f40048

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, String> dictionary = new HashMap<>();
        dictionary.put('y', "yuz");

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
