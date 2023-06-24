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
        int noName = 0;
        Set<String> positions = new HashSet<>();
        positions.add("-1,-5");
        int x = -1;
        int y = -5;
        boolean testingBool = false;
        while (sc.hasNext() && testingBool != true) {
            String command = sc.next();
            if (command.equals("q")) {
                testingBool = true;
            }
            int size = sc.nextInt();
                if (command.equals("l")) {
                    x -= size;
                } else if (command.equals("r")) {
                    x += size;
                } else if (command.equals("u")) {
                    y += size;
                } else if (command.equals("d")) {
                    y -= size;
                }
                String currentPosition = x + "," + y;
                boolean touched = positions.contains(currentPosition)
                if(noName == 0){
                    System.out.println("");
                    noName++;
                }
                if (touched == true) {
                    System.out.println(currentPosition + " DANGER");
                } else {
                    System.out.println(currentPosition + " safe");
                    positions.add(currentPosition);
                }
            }
        }
    }
