import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String[][] storage = new String[3][3];
        storage[0][0] = "*";
        storage[0][1] = "X";
        storage[0][2] = "*";
        storage[1][0] = "";
        storage[1][1] = "X";
        storage[1][2] = "X";
        storage[2][0] = "*";
        storage[2][1] = "";
        storage[2][2] = "*";
        for (int i = 0; i < input * input; i++) {
            for (int j = 0; j < input * input; j++) {
                if(i < input && j < input){
                System.out.print("*");
                }
                else if(i < input && j < input * 2){
                    System.out.print("x");
                } else if (i < input && j < input * 3 && input * 3 > input * 2) {
                    System.out.print("*");
                } else if (i < input * 2 && j < input) {
                    System.out.print(" ");
                }
                else if(i < input * 2 && j < input * 2){
                    System.out.print("x");
                } else if (i < input * 2 && j < input * 3 && input * 3 > input * 2) {
                    System.out.print("x");
                }
                else if (i < input * 3 && j < input) {
                System.out.print("*");
                }
                else if(i < input * 3 && j < input * 2){
                System.out.print(" ");
                } else if (i < input * 3 && j < input * 3 && input * 3 > input * 2) {
                System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
/*

*x*
 xx
* *

 */