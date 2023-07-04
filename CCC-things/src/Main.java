import java.util.Scanner;

// https://cccgrader.com/getproblem.php?fid=150553&authcode=3d6e03d95dbedc67f696b9c1ad39f699
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] placeholder = input.split(":");
        int hours = Integer.parseInt(placeholder[0]);
        int minutes = Integer.parseInt(placeholder[1]);
        float changeAmountH = 0;
        float changeAmountM = 0;
        if(hours + changeAmountH >= 7 && hours + changeAmountH < 10){
            while(hours + changeAmountH < 10){
                changeAmountH = 10 - hours;
            }
            changeAmountM += (4 - changeAmountH) / 2;
        }

        else if(hours + changeAmountH >= 15 && hours + changeAmountH < 19){
            while(hours + changeAmountH < 19){
                changeAmountH = 19 - hours;
            }
            changeAmountM += (4 - changeAmountH) / 2;
        }

        else{
            changeAmountH = 2;
        }
        int outputM = (int) ((minutes + changeAmountM * 60)) % 60;
        int outputH = (int) ((hours + changeAmountH) % 24);
        if(outputM == 0 && changeAmountM == 0){
            if(outputH < 10) {
                System.out.println("0" + outputH + ":" + "00");
            }
            else{
                System.out.println(outputH + ":" + "00");
            }
        }
        else {
            if(outputH < 10) {
                System.out.println("0" + outputH + ":" + outputM);
            }
            else{
                System.out.println(outputH + ":" + outputM);
            }
        }


    }
}