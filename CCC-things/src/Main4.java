import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int five = sc.nextInt();
        int six = sc.nextInt();
        if ((one * 3) + (two * 2) + three > (four * 3) + (five * 2) + six) {
            System.out.println('A');
        }
        if ((one * 3) + (two * 2) + three < (four * 3) + (five * 2) + six) {
            System.out.println('B');
        }
        if ((one * 3) + (two * 2) + three == (four * 3) + (five * 2) + six) {
            System.out.println('T');
        }
    }
}

/*
Sample inputs
10
3
7
8
9
6
 */