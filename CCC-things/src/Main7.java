import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.next().split(",");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }
        System.out.println(minX - 1 + "," + (minY - 1));
        System.out.println(maxX + 1 + "," + (maxY + 1));
    }
}