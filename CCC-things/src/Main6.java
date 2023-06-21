import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] input = new String[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.next();
        }
        sc.close();

        for (String s : input) {
            int count = 0;
            char c = ' ';
            // 777777......TTTTTTTTTTTT
            for (int i = 0; i < s.length(); i++) {
                char curChar = s.charAt(i);
                if (curChar == c) {
                    count++;
                } else {
                    if (i != 0) {
                        System.out.print(count + " " + c + " ");
                    }
                    c = curChar;
                    count = 1;
                }
                if (i == s.length() - 1) {
                    System.out.println(count + " " + c);
                }
            }
        }
    }

}


/*
Sample Input
4
+++===!!!!
777777......TTTTTTTTTTTT
(AABBC)
3.1415555
Output for Sample Input
3 + 3 = 4 !
6 7 6 . 12 T
1 ( 2 A 2 B 1 C 1 )
1 3 1 . 1 1 1 4 1 1 4 5
 */