import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//https://cccgrader.com/getproblem.php?fid=146516&authcode=e79090007d2b282d7ee16a3d355b9a10
public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> key = new HashMap<>();
        key.put(1234, 1);
        key.put(111, 5);
        key.put(123, 5);
        key.put(135, 5);
        key.put(147, 5);
        key.put(159, 5);
        key.put(210, 5);
        key.put(222, 5);
        key.put(234, 5);
        key.put(246, 5);
        key.put(258, 5);
        key.put(321, 3);
        key.put(333, 3);
        key.put(345, 3);
        key.put(432, 4);
        key.put(444, 4);
        key.put(456, 4);
        key.put(420, 4);
        key.put(555, 3);
        key.put(543, 3);
        key.put(531, 3);
        key.put(654, 3);
        key.put(630, 3);
        key.put(753, 2);
        key.put(741, 2);
        key.put(852, 2);
        key.put(840, 2);
        key.put(951, 1);
        key.put(1111, 1);

        int shift = sc.nextInt();
        int output = 0;
        int currentTime = 1201;
        for (int i = 0; i < shift; i++){
            if(key.containsKey(currentTime)){
                output += 1;
            }
            currentTime++;
            if(currentTime == 1260){
                currentTime = 100;
            } else if (currentTime == 160) {
                currentTime = 200;
            } else if (currentTime == 260) {
                currentTime = 300;
            } else if (currentTime == 360) {
                currentTime = 400;
            } else if (currentTime == 460) {
                currentTime = 500;
            } else if (currentTime == 560) {
                currentTime = 600;
            } else if (currentTime == 660) {
                currentTime = 700;
            } else if (currentTime == 760) {
                currentTime = 800;
            } else if (currentTime == 860) {
                currentTime = 900;
            } else if (currentTime == 960) {
                currentTime = 1000;
            } else if (currentTime == 1060) {
                currentTime = 1100;
            } else if (currentTime == 1160) {
                currentTime = 1200;
            }
        }
        System.out.println(output);
    }
}
//ALL MATCHES
//1234, 111 123 135 147 159, 210 222 234 246 258, 321 333 345, 432 456 444 420, 555 543 531,  654 631 630, 753 741, 852 840, 951, 1111
//12, 1                      2                    3            4                5                        6                    7                    8                    9