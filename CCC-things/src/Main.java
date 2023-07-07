import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// https://cccgrader.com/getproblem.php?fid=146516&authcode=e79090007d2b282d7ee16a3d355b9a10
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int days = size / 1440;
        int minutes = size % 1440;
        int counter = 0;
        int counterDay = 0;
        for (int i = 0; i < 1440; i++) {
            if (isArithmetic(i)) {
                if (i < minutes) {
                    counter ++;
                }
                counterDay ++;
            }
        }
        int total = days * counterDay + counter;
        System.out.println(total);
    }

    // starting from 12
    // after i minutes
    // is this an arithmetic time?
    private static boolean isArithmetic(int minutes) {
        int time = (720 + minutes) % 1440;
        int hr = time / 60;
        int m = time % 60;
        List<Integer> list = new ArrayList<>();
        if (hr > 9) {
            list.add(hr/10);
        }
        list.add(hr %10);
        list.add(m/10);
        list.add(m%10);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i< list.size() -1; i++) {
            int newDiff = list.get(i + 1) - list.get(i);
            if(i == 0) {
                diff = newDiff;
            } else if(newDiff != diff) {
                return false;
            }
        }
        return true;
    }
}
