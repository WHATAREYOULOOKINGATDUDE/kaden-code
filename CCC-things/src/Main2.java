import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[][] days = new char[size][5];
        for (int i = 0; i < size; i++) {
            days[i] = sc.next().toCharArray();
        }
        sc.close();
        int max = 0;
        int column = 0;
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (days[j][i] == 'Y') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                column = i;
            }
        }
        System.out.println(column + 1);
    }

}

/*
Sample 1
3
YY.Y.
...Y.
.YYY.
 */
