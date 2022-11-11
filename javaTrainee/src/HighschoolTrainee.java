import java.util.Scanner;

public class HighschoolTrainee {
    public static void main(String[] args) {
        int Inputname;

        System.out.println("Welcome and thank you for your rating");
        Scanner rd = new Scanner(System.in);
        int score = rd.nextInt();
        if ( score > 70){
            System.out.println("Approved");
        }
        else {
           System.out.println("Disapprove");
        }
    }
}
