public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int cash = 2000;
        int limit = 1000;
        int bonus;
        if (cash >= limit) {
             bonus = cash / 100;
        } else {
             bonus = 0;
            int total = balance + cash + bonus;

            System.out.println(total);}
        }
    }