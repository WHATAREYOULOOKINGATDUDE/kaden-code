import java.util.Arrays;
import java.util.Scanner;

public class Mean_and_MAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        float result1 = 0;
        float result2 = 0;
        float result3 = 0;
        float[] inputs = new float[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = sc.nextFloat();
            result1 += inputs[i];
        }
        result1 = result1 / length;
        for (int i = 0; i < length; i++) {
            if (inputs[i] < result1) {
                result2 += result1 - Math.abs(inputs[i]);
            }
            if (inputs[i] >= result1) {
                result2 += Math.abs(inputs[i]) - result1;
            }
        }
        Arrays.sort(inputs);
        if (length % 2 == 0) {
            float middleElement1 = inputs[length / 2 - 1];
            float middleElement2 = inputs[length / 2];
            result3 = (middleElement1 + middleElement2) / 2;
        } else {
            result3 = inputs[length / 2];
        }

        System.out.println("Median:" + result3);
        System.out.println("MAD:" + result2 / length);
        System.out.println("Mean:" + result1);
    }
}