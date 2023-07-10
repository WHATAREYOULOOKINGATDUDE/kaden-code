import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input > 1) {
            for (int i = 0; i < input * 3; i++) {
                for (int j = 0; j < input * 3; j++) {
                    if (i < input && j < input) {
                        System.out.print("*");
                    } else if (i < input && j < input * 2) {
                        System.out.print("x");
                    } else if (i < input && j < input * 3 && input * 3 > input * 2) {
                        System.out.print("*");
                    } else if (i < input * 2 && j < input) {
                        System.out.print(" ");
                    } else if (i < input * 2 && j < input * 2) {
                        System.out.print("x");
                    } else if (i < input * 2 && j < input * 3 && input * 3 > input * 2) {
                        System.out.print("x");
                    } else if (i < input * 3 && j < input) {
                        System.out.print("*");
                    } else if (i < input * 3 && j < input * 2) {
                        System.out.print(" ");
                    } else if (i < input * 3 && j < input * 3 && input * 3 > input * 2) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        else if(input == 1){
         System.out.println("*x*\n" +
                 " xx\n" +
                 "* *\n");
        }
    }
}
/*

*x*
 xx
* *

 */