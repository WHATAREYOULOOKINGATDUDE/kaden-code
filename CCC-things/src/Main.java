import java.util.*;

/*
https://cccgrader.com/getproblem.php?fid=221072&authcode=d0610e41c96deacefd6f634c059ccf27
l 2
d 2
r 1
q 0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> positions = new HashSet<>(Set.of(
                "0,-1",
                "0,-2",
                "0,-3",
                "1,-3",
                "2,-3",
                "3,-3",
                "3,-4",
                "3,-5",
                "4,-5",
                "5,-5",
                "5,-4",
                "5,-3",
                "6,-3",
                "7,-3",
                "7,-4",
                "7,-5",
                "7,-6",
                "7,-7",
                "6,-7",
                "5,-7",
                "4,-7",
                "3,-7",
                "2,-7",
                "1,-7",
                "0,-7",
                "-1,-7",
                "-1,-6",
                "-1,-5"));
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
                currentPosition = x + "," + y;
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
