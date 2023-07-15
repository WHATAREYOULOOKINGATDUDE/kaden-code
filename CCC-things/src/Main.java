import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] day = new char[size];
        int[][] peoplePoints = new int[size][5];
        int[] maxPoints = new int[5];
        int counter2 = 0;
        int placeholder = 0;
        for (int i = 0; i < size; i++) {
            day = sc.next().toCharArray();
            for(int j = 0; j < 5; j++) {
                if (day[j] == '.') {
                    peoplePoints[i][j] = 0;
                } else {
                    peoplePoints[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            int[] counter = new int[5];
            for(int j = 0; j < size; j++) {
                if(peoplePoints[j][i] == 1){
                    counter[i] += 1;
                }
            }
            if(counter[i] > placeholder){
                for(int j = 0; j < 5; j++) {
                    maxPoints[j] = 0;
                }
                placeholder = counter[i];
                maxPoints[0] = i + 1;
            } else if (counter[i] == placeholder) {
                maxPoints[counter2 + 1] = i + 1;
                counter2++;
            }
        }
        for(int i = 0; i <= counter2; i++){
            if (counter2 > 0 && i + 1 <= counter2) {
                System.out.print(maxPoints[i]);
                System.out.print(',');
            } else if (counter2 != 0){
                System.out.print(maxPoints[i]);
            }
        }
        if(counter2 == 0) {
            System.out.print(maxPoints[0]);
        }
    }
}
/*
Sample 1
3
YY.Y.
...Y.
.YYY.
 */