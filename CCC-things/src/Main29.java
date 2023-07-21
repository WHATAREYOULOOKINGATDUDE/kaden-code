import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String string = sc.nextLine();
        if (isCyclicShift(input, string)) {
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
    public static boolean isCyclicShift(String input, String string) {
        for (int i = 0; i <= input.length() - string.length(); i++) {
            if (input.substring(i, i + string.length()).equals(string)) {
                return true;
            }
        }
        return false;
    }
}
