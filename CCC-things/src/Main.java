import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cows = sc.nextInt();
        int canes = sc.nextInt();
        long[] cowHeights = new long[cows];
        long[] canesHeight = new long[canes];
        long[] outputs;

        for (int i = 0; i < cows; i++){
            cowHeights[i] = sc.nextInt();
        }

        for (int i = 0; i < canes; i++){
            canesHeight[i] = sc.nextInt();
        }

        outputs = cowHeights;

        if(canes != 0) {
            for (int i = 0; i < canes; i++) {
                long alreadyEaten = 0;

                for (int j = 0; j < cows; j++) {
                    if (alreadyEaten == canesHeight[i]) {
                        break;
                    }
                    if (cowHeights[j] <= canesHeight[i]) {
                        if (cowHeights[j] - alreadyEaten > 0) {
                            long ae = cowHeights[j] - alreadyEaten;
                            outputs[j] += ae;
                            alreadyEaten += ae;
                        }
                    } else if (cowHeights[j] > canesHeight[i]) {
                        outputs[j] += canesHeight[i] - alreadyEaten;
                        canesHeight[i] = 0;
                    }
                }
            }
        }
        for (long cowHeight : cowHeights) {
            System.out.println(cowHeight);
        }
    }
}
/*
SAMPLE INPUT:
3 2
3 2 5
6 1
SAMPLE OUTPUT:
7
2
7
 */