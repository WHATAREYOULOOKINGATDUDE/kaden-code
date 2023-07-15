import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] counts = new int[5];
        for (int i = 0; i < size; i++) {
            char[] day = sc.next().toCharArray();
            for(int j = 0; j < 5; j++) {
                if (day[j] == 'Y') {
                    counts[j] = counts[j] + 1;
                }
            }
        }
        List<Integer> days = new ArrayList<>();
        int max = 0;
        for(int i = 0; i<5; i++) {
            int n = counts[i];
            if (n == max) {
                days.add(i + 1);
            } else if (n > max) {
                max = n;
                days.clear();
                days.add(i + 1);
            }
        }
        String result = "";
        for (int i = 0; i < days.size(); i++) {
            if (i == 0) {
                result += days.get(i);
            } else {
                result += "," + days.get(i);
            }
        }
        System.out.println(result);

    }
}
/*
Sample 1
3
YY.Y.
...Y.
.YYY.
 */