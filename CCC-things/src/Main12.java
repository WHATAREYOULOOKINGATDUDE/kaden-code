import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int battery = sc.nextInt();
        int xDist = Math.abs(x1 - x2);
        int yDist = Math.abs(y1 - y2);
        int dist = xDist + yDist;
        if (battery < dist) {
            System.out.println("N");
        } else if ((battery - dist) % 2 == 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
/*
Sample Input 1
3 4
3 3
3
Output for Sample Input 1
Y
 */