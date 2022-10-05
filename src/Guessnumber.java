import java.util.Random;
import java.util.Scanner;

public class Guessnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int minNum = 0;
        int maxNum = 100;
        Random r = new Random();
        int answerNum = r.nextInt(maxNum - minNum) + minNum;
        //System.out.println(answerNum);
        while (true) {
            System.out.println("Please input a num (" + minNum + "~" + maxNum + "):");
            int guessNum = s.nextInt();
            if (guessNum == answerNum) {
                System.out.println("Yes! You are correct!");
                break;
            }else if(guessNum < answerNum){
                minNum = guessNum + 1;
            }else {
                maxNum = guessNum - 1;
            }
        }
    }
}
