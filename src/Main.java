import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int rub = 200;
        int bonus = (rub / 100);
        int res = (clientAccount + rub + bonus);

        if (rub < 1100) {
            int Баланс;
            System.out.println("Баланс" + " "+ (clientAccount + rub) + "\nБонус(ы) не начислен(ы)");

        } else {
            int Баланс;
            System.out.println("Баланс" + " " + res + "\nБонус(ы) начислен(ы)");
        }


    }
}

