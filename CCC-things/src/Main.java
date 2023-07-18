import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        char[][] output = new char[2][2];
        int hFlips = 0;
        int vFlips = 0;
        output[0][0] = 1;
        output[1][0] = 2;
        output[0][1] = 3;
        output[1][1] = 4;
        for(int i = 0; i < input.length; i++){
        if(input[i] == 'V'){
            vFlips++;
        }
        else{
            hFlips++;
        }
        }
        hFlips = hFlips % 2;
        vFlips = vFlips % 2;
        if(hFlips == 0 && vFlips == 0){
            System.out.println("1 2");
            System.out.println("3 4");
        } else if (hFlips == 1 && vFlips == 0) {
            System.out.println("3 4");
            System.out.println("1 2");
        } else if (hFlips == 0 && vFlips == 1) {
            System.out.println("2 1");
            System.out.println("4 3");
        } else {
            System.out.println("4 3");
            System.out.println("2 1");
        }

    }
}