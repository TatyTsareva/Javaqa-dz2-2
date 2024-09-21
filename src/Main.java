

public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int rub = 100;
        int bonus = (rub / 100);
        int res = (clientAccount + rub + bonus);

        if (rub < 1100) {
            System.out.println("Ваш Баланс:");
            System.out.println(clientAccount + rub + "\nБонус(ы) не начислен(ы)");

        } else {
            System.out.println("Ваш Баланс:");
            System.out.println(res + "\nБонус(ы) начислен(ы)" + " " + bonus);
        }


    }
}

