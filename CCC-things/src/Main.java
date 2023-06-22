import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int name = 0;
        int highest = 0;
        int highest2 = 0;
        int placeholder = 0;
        int placeholder2 = 0;
        int size = sc.nextInt();
        int inputs2 [][] = new int[3][size];
        String[] inputs = new String[size];
        for (int i = 0; i < size; i++){
            inputs[i] = sc.next();
            for(int j = 0; j < 3; j++) {
                inputs2[j][i] = sc.nextInt();
            }
        }

        for(int i = 0; i < size; i++){
            if(2 * inputs2[0][i] + 3 * inputs2[1][i] + inputs2[2][i] > placeholder) {
                highest = i;
                placeholder = 2 * inputs2[0][i] + 3 * inputs2[1][i] + inputs2[2][i];
                }
        }
        for(int i = 0; i < size; i++){
            if(placeholder >= 2 * inputs2[0][i] + 3 * inputs2[1][i] + inputs2[2][i] && 2 * inputs2[0][i] + 3 * inputs2[1][i] + inputs2[2][i] > placeholder2 && highest != i){
                highest2 = i;
                placeholder2 = 2 * inputs2[0][i] + 3 * inputs2[1][i] + inputs2[2][i];
            }
        }
        System.out.println(inputs[highest]);
        System.out.println(inputs[highest2]);
    }
}
/*
4
ABC 13 22 1
DEF 10 20 30
GHI 11 2 2
JKL 20 20 20
*/