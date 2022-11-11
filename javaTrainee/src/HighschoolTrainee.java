import java.util.Scanner;

public class HighschoolTrainee {
    public static void main(String[] args) {
        //Repeat
        boolean cancion = true;
        Scanner rd = new Scanner(System.in);
        while(cancion){
            System.out.println("How much is 2x2+2?");
            System.out.println("1.- 6");
            System.out.println("2.- 8");
            System.out.println("3.- 10");
            int Userinput = rd.nextInt();
            if (Userinput==1) {
                cancion = false;
                System.out.println("Correct!!!");
            }else{
                System.out.println("Incorrect!!!");
            }

        }
    }
}
