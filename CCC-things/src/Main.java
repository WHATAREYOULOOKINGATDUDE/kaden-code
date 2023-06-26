import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingShift = sc.nextInt();
        int shiftAmount = 0;
        String startingLetters = sc.next();
        char processedLetters[] = new char[startingLetters.length()];
        char numberLetters[] = new char[startingLetters.length()];
        int overflowCounter = 0;
        processedLetters = startingLetters.toCharArray();
        String finalWord = "";

        for(int i = 0; i < numberLetters.length; i++){
            shiftAmount = startingShift + (3 * (i + 1));
            if(abs(shiftAmount - processedLetters[i]) < 65) {
                overflowCounter = abs(65 + (shiftAmount - processedLetters[i]));
            }

            if(overflowCounter == 0){
                numberLetters[i] = (char) (processedLetters[i] - shiftAmount);
            }
            else{
                numberLetters[i] = (char) ('Z' - overflowCounter - 1);
            }
            finalWord = numberLetters.toString();
        }
        System.out.println(finalWord);
    }
}
/*
65  A         97  a
66  B         98  b
67  C         99  c
68  D        100  d
69  E        101  e
70  F        102  f
71  G        103  g
72  H        104  h
73  I        105  i
74  J        106  j
75  K        107  k
76  L        108  l
77  M        109  m
78  N        110  n
79  O        111  o
80  P        112  p
81  Q        113  q
82  R        114  r
83  S        115  s
84  T        116  t
85  U        117  u
86  V        118  v
87  W        119  w
88  X        120  x
89  Y        121  y
90  Z        122  z
 */