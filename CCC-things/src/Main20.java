import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        int longest = findLongest(word);
        System.out.println(longest);
    }
    public static int findLongest(String word) {
        int maxLength = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = word.length() - 1; j >= i; j--) {
                if (isPalindrome(word, i, j)) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                    break;
                }
            }
        }
        return maxLength;
    }
    public static boolean isPalindrome(String word, int start, int end) {
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
