import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String last = "";
        while (true) {
            int num = sc.nextInt();
            if (num == 99999) {
                break;
            }
            int first = num / 10000;
            int second = (num / 1000) % 10;
            int third = num % 1000;
            if ((first + second) % 2 == 1) {
                System.out.println("left " + third);
                last = "left ";
            } else if (first + second == 0) {
                System.out.println(last + third);
            } else {
                System.out.println("right " + third);
                last = "right ";
            }
        }


    }
}
/*
Sample Input
57234
00907
34100
99999
Output for Sample Input
right 234
right 907
left 100
 */
