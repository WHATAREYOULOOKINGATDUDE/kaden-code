import java.util.Scanner;

// https://cccgrader.com/getproblem.php?fid=150553&authcode=3d6e03d95dbedc67f696b9c1ad39f699
public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] placeholder = input.split(":");
        int minutes = Integer.parseInt(placeholder[0]) * 60 + Integer.parseInt(placeholder[1]);

        for (int i = 0; i < 120; i++) {
            if ((minutes >= 420 && minutes < 600 - 1) || (minutes >= 900 && minutes < 1120 - 1) ) {
                minutes += 2;
            } else {
                minutes ++;
            }
        }
        minutes = minutes % 1440;

        int h = minutes / 60;
        int m = minutes % 60;

        String hStr = h < 10 ? "0" + h : "" + h;
        String mStr = m < 10 ? "0" + m : "" + m;
        System.out.println(hStr + ":" + mStr);

    }
}