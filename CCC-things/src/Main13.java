import java.util.Scanner;
// https://cccgrader.com/getproblem.php?fid=221084&authcode=8da8ad5f866e4bec2889bf24d4f4bc2d
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highest = 0;
        int highest2 = 0;
        int placeholder = 0;
        int placeholder2 = 0;
        int size = sc.nextInt();
        int specs [][] = new int[3][size];
        String[] names = new String[size];
        for (int i = 0; i < size; i++){
            names[i] = sc.next();
            for(int j = 0; j < 3; j++) {
                specs[j][i] = sc.nextInt();
            }
        }

        for(int i = 0; i < size; i++){
            if(2 * specs[0][i] + 3 * specs[1][i] + specs[2][i] > placeholder) {
                highest = i;
                placeholder = 2 * specs[0][i] + 3 * specs[1][i] + specs[2][i];
                }
        }
        for(int i = 0; i < size; i++){
            if(placeholder >= 2 * specs[0][i] + 3 * specs[1][i] + specs[2][i] && 2 * specs[0][i] + 3 * specs[1][i] + specs[2][i] > placeholder2 && highest != i){
                highest2 = i;
                placeholder2 = 2 * specs[0][i] + 3 * specs[1][i] + specs[2][i];
            }
        }
        System.out.println(names[highest]);
        System.out.println(names[highest2]);
    }
}
/*
4
ABC 13 22 1
DEF 10 20 30
GHI 11 2 2
JKL 20 20 20
*/