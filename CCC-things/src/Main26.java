import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        char[] inputC = sc.nextLine().toCharArray();
        int storedNumber = 0;
        int size = inputC.length;
        int counter = 0;
        for(int i = 0; i < size; i++){
            if(inputC[i] <= 59 && inputC[i] >= 49){

                storedNumber = inputC[i] - 48;

            }
            else{
                if(inputC[i] == 'I'){
                    total += storedNumber;
                } else if(inputC[i] == 'V'){
                    total += storedNumber * 5;
                } else if(inputC[i] == 'X'){
                    total += storedNumber * 10;
                } else if(inputC[i] == 'L'){
                    total += storedNumber * 50;
                } else if(inputC[i] == 'C'){
                    total += storedNumber * 100;
                } else if(inputC[i] == 'D'){
                    total += storedNumber * 500;
                } else if(inputC[i] == 'M'){
                    total += storedNumber * 1000;
                }
            }

        }

        System.out.println(total);
    }
}