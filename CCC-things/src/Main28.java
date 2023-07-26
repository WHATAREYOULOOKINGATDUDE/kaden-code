import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        int hFlips = 0;
        int vFlips = 0;

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