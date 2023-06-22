import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n < 6) {
            for (int i = 0; i <= n / 2; i++) {
                count++;
            }
        }
        else{
            if(n == 6){
                count = 3;
            }
            else if(n == 7){
                count = 2;
            }
            else if(n == 8){
                count = 2;
            }
            else{
                count = 1;
            }

        }
        System.out.println(count);
        }

    }

