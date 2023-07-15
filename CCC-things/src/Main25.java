import java.util.Scanner;
//https://cccgrader.com/getproblem.php?fid=221065&authcode=5057fc9fe97062b911173ce8a98cfbd4
public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questions = sc.nextInt();
        char[] studentAnswers = new char[questions];
        char[] answerKey = new char[questions];
        String studentAnswersS = "";
        String answerKeyS = "";
        int output = 0;
        for(int i = 0; i < questions; i++) {
            studentAnswersS += sc.next();
        }
        for(int i = 0; i < questions; i++){
            answerKeyS += sc.next();
        }
        studentAnswers = studentAnswersS.toCharArray();
        answerKey = answerKeyS.toCharArray();
        for(int i = 0; i < questions; i++){
            if(studentAnswers[i] == answerKey[i]){
                output++;
            }
        }
        System.out.println(output);
    }
}
/*

Sample Input 1
3
A
B
C
A
C
B
Output for Sample Input 1
1

 */