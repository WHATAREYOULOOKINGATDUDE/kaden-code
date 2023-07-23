import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String allowedLetters = "IOSHZXN";
        boolean result = false;
        for (char letter : input.toCharArray()) {
            if (!allowedLetters.contains(String.valueOf(letter))) {
                result = false;
                break;
            }
            result = true;
        }
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}