import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        String s = scanner.nextLine();
        List<Move> moves = findWinningMoves(s);
        if (moves == null) {
            System.out.println("-1");
        } else {
            System.out.println(moves.size());
            for (Move move : moves) {
                System.out.println(move.start + " " + move.length);
            }
        }
    }

    private static List<Move> findWinningMoves(String s) {
        List<Move> moves = new ArrayList<>();
        while (true) {
            int i = findConsecutiveBlocks(s);
            if (i == -1) { // no more consecutive blocks
                if (s.isEmpty()) { // all blocks removed
                    return moves;
                } else {
                    return null; // cannot remove remaining blocks
                }
            }
            int j = findEndOfConsecutiveBlocks(s, i);
            moves.add(new Move(i + 1, j - i));
            s = s.substring(0, i) + s.substring(j);
        }
    }

    private static int findConsecutiveBlocks(String s) {
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                return i;
            }
        }
        return -1; // no consecutive blocks found
    }

    private static int findEndOfConsecutiveBlocks(String s, int i) {
        char c = s.charAt(i);
        int j = i + 1;
        while (j < s.length() && s.charAt(j) == c) {
            j++;
        }
        return j;
    }

    private static class Move {
        public final int start;
        public final int length;

        public Move(int start, int length) {
            this.start = start;
            this.length = length;
        }
    }
}
