import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int output = 0;
        boolean ignored = false;
        int[] numbers = new int[size];
        int ignoreCounter = 0;
        int arrayCount = 0;
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                ignored = true;
            }
                if (!ignored) {
                    numbers[arrayCount] = num;
                    arrayCount++;
                } else {
                    ignoreCounter++;
                    numbers[i - ignoreCounter] = 0;
                    ignoreCounter++;
                    ignored = false;
                    arrayCount--;
                }
        }

        for(int i = 0; i < size; i++){
            output += numbers[i];
        }
        System.out.println(output);
    }
}
