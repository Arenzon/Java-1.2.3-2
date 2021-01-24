public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int cash = 500;
        int bonus = 0;

        if (cash > 1000) {
            bonus = cash / 100;
        }
        balance = balance + cash + bonus;
        System.out.print("Бонус " + bonus + "\nТекущий счет " + balance);
    }
}
