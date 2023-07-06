import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int tCount = 0;
        int sCount = 0;
        for (int i = 0; i < size; i++) {
            String line = sc.nextLine();
            for (char c : line.toCharArray()) {
                if (c == 't' || c == 'T') {
                    tCount++;
                } else if (c == 's' || c == 'S') {
                    sCount++;
                }
            }
        }
        System.out.println("");
        if (tCount > sCount) {
            System.out.println("English");
        } else if (sCount > tCount) {
            System.out.println("French");
        } else {
            System.out.println("English");
        }
    }
}
