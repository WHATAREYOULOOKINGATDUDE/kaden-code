import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        Map<String, Character> input = new HashMap<>();
        for (int i = 0; i < k; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            char letters = parts[0].charAt(0);
            String key = parts[1];
            input.put(key, letters);
        }
        String numbers = sc.nextLine();
        String decodedSequence = "";
        String currentCode = "";
        for (int i = 0; i < numbers.length(); i++) {
            currentCode += numbers.charAt(i);
            if (input.containsKey(currentCode)) {
                char character = input.get(currentCode);
                decodedSequence += String.valueOf(character);
                currentCode = "";
            }
        }
        System.out.println(decodedSequence);
    }
}
