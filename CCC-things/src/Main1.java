import java.util.Objects;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int totalSpice = 0;
        for (int i = 0; i <= size; i++) {
            String names = sc.nextLine();
            if (Objects.equals(names, "Poblano")) {
                totalSpice += 1500;
            } else if (Objects.equals(names, "Mirasol")) {
                totalSpice += 6000;
            } else if (Objects.equals(names, "Serrano")) {
                totalSpice += 15500;
            } else if (Objects.equals(names, "Cayenne")) {
                totalSpice += 40000;
            } else if (Objects.equals(names, "Thai")) {
                totalSpice += 75000;
            } else if (Objects.equals(names, "Habanero")) {
                totalSpice += 125000;
            }
        }
        sc.close();
        System.out.println(totalSpice);
    }
}

/*
Poblano 1500
Mirasol 6000
Serrano 15500
Cayenne 40000
Thai 75000
Habanero 125000
4
Poblano
Cayenne
Thai
Poblano
 */
