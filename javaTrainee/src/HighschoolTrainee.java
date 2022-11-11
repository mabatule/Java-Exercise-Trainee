import java.util.Scanner;

public class HighschoolTrainee {
    public static void main(String[] args) {
        //Repeat
        int numH,earnedMoney,vacationH;
        double aux,resulttotal;
        resulttotal=0;
        Scanner rd = new Scanner(System.in);


        System.out.println("How many hours does the employee work per week?");
        numH= rd.nextInt();

        System.out.println("How much money does the employee earn per hour?");
        earnedMoney= rd.nextInt();
        int result= (numH * earnedMoney) * (12 * 4 );
        System.out.println("The money earned per year is: "+ result);
        System.out.println("How many vacation days did you have?");
        vacationH= rd.nextInt();
        System.out.println("How many vacation days did you have?");
        // how much do you earn per day operation

        System.out.println("Taking into account vacation days");

        aux= (result/365) * vacationH;
        System.out.println("On his vacation days he earned: " + aux);
        resulttotal = result + aux;
        System.out.println("Total " + resulttotal);


    }
}
