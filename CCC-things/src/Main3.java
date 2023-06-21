import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        sc.close();
        if (((s * 1) + (m * 2) + (l * 3)) >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }


    }
}

