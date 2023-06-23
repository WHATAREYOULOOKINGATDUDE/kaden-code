import java.util.Scanner;
// https://cccgrader.com/getproblem.php?fid=221084&authcode=8da8ad5f866e4bec2889bf24d4f4bc2d
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highest = 0;
        int highest2 = 0;
        String highestName = null;
        String highestName2 = null;
        int size = sc.nextInt();
        int specs [][] = new int[3][size];
        String[] names = new String[size];
        for (int i = 0; i < size; i++){
            names[i] = sc.next();
            for(int j = 0; j < 3; j++) {
                specs[j][i] = sc.nextInt();
            }
            int score = 2 * specs[0][i] + 3 * specs[1][i] + specs[2][i];
            if (score > highest || (score == highest && highestName != null && names[i].compareTo(highestName) < 0)) {
                highest2 = highest;
                highestName2 = highestName;
                highest = score;
                highestName = names[i];
            } else if (score > highest2 || (score == highest2 && highestName2 != null && names[i].compareTo(highestName2) < 0)) {
                highest2 = score;
                highestName2 = names[i];
            }
        }
        if(highestName != null) {
            System.out.println(highestName);
        }
        if(highestName2 != null) {
            System.out.println(highestName2);
        }
    }
}
/*
4
ABC 13 22 1
DEF 10 20 30
GHI 11 2 2
JKL 20 20 20
*/