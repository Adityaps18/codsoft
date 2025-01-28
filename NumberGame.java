import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Random r=new Random();
        int attempt = 10,wins=0;
        int ch,flag=0;
        Scanner s=new Scanner(System.in);
        while(true) {
            int rand_num=r.nextInt(1,101);
            System.out.println("Guess: ");
            int Guess = s.nextInt();
            while (attempt!=0) {
                if (Guess<rand_num) {
                    System.out.println("Too Low");
                }
                else if(Guess>rand_num){
                    System.out.println("Too High");
                }
                else {
                    System.out.println("Correct Guess");
                    wins+=1;
                    flag=1;
                    break;
                }
                attempt-=1;
                if(attempt!=0){
                    System.out.println("You Have" +attempt+ "Attempt only");
                    System.out.println("Enter Guess: ");
                    Guess=s.nextInt();
                }
            }
            if (flag == 0){
                attempt = 10;
                flag=0;
            }
            else {
                break;
            }
        }
        System.out.println("Thank You for Playing Along");
    }
}
