public class Main {
    public static void main(String[] args) {
        int startAccount;
        startAccount = 100;
        int topupAccount = 1100;
        int onebonus = 100;
        int bonus;
        int total;
        if (topupAccount > 1000) {
            bonus = topupAccount / onebonus;
            total = startAccount + topupAccount + bonus;
        } else {
            total = startAccount + topupAccount;
            bonus = 0;
        }

        System.out.println("На Вашем счете: " + total + " рублей");
        System.out.println("Ваш бонус " + bonus + " рублей");
    }
