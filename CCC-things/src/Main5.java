import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int thing1 = sc.nextInt();
            String thing = sc.next();
            System.out.println("");
            for (int j = 0; j < thing1; j++) {
                System.out.print(thing);
            }

        }

    }
}

/*
Sample inputs
4
9 +
3 -
12 A
2 X
 */