import java.util.*;

/*
https://cccgrader.com/getproblem.php?fid=221072&authcode=d0610e41c96deacefd6f634c059ccf27
l 2
d 2
r 1
q 0
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> positions = new HashSet<>();
        positions.add("0 -1");
        positions.add("0 -2");
        positions.add("0 -3");
        positions.add("1 -3");
        positions.add("2 -3");
        positions.add("3 -3");
        positions.add("3 -4");
        positions.add("3 -5");
        positions.add("4 -5");
        positions.add("5 -5");
        positions.add("5 -4");
        positions.add("5 -3");
        positions.add("6 -3");
        positions.add("7 -3");
        positions.add("7 -4");
        positions.add("7 -5");
        positions.add("7 -6");
        positions.add("7 -7");
        positions.add("6 -7");
        positions.add("5 -7");
        positions.add("4 -7");
        positions.add("3 -7");
        positions.add("2 -7");
        positions.add("1 -7");
        positions.add("0 -7");
        positions.add("-1 -7");
        positions.add("-1 -6");
        positions.add("-1 -5");
        int x = -1;
        int y = -5;
        boolean printed = false;
        while (sc.hasNext()) {
            if (!printed) {
                System.out.println();
                printed = true;
            }
            String command = sc.next();
            if (command.equals("q")) {
                break;
            }
            int steps = sc.nextInt();
            boolean touched = false;
            String currentPosition = null;
            for(int i = 0; i < steps; i++) {
                if (command.equals("l")) {
                    x--;
                } else if (command.equals("r")) {
                    x++;
                } else if (command.equals("u")) {
                    y++;
                } else if (command.equals("d")) {
                    y--;
                }
                currentPosition = x + " " + y;
                touched = touched || positions.contains(currentPosition);
                positions.add(currentPosition);
            }
            if (touched) {
                System.out.println(currentPosition + " DANGER");
                break;
            } else {
                System.out.println(currentPosition + " safe");
            }
        }
    }
}
