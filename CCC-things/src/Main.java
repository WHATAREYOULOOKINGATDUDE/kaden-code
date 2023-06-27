import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        input++;

        while (!hasDistinctDigits(input)) {
            input++;
        }

        System.out.println(input);
    }
    public static boolean hasDistinctDigits(int input) {
        boolean[] digitSeen = new boolean[10];
        while (input > 0) {
            int number = input % 10;
            if (digitSeen[number]) {
                return false;
            }
            digitSeen[number] = true;
            input /= 10;
        }
        return true;
    }
}