public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 100;
        int refill = 1300;
        int bonus;
        if (refill > 1000)
        { bonus = refill / 100 * 1;
        }
        else {
            bonus = 0;
        }
        int totalbonus = balance + refill + bonus;
        System.out.println("Текущий баланс " + balance + " руб + " + "Поступили денежные средства в размере " + refill +
                " руб + " + "Ваш бонус составил " + bonus + " руб = " + "Ваш баланс = " + totalbonus + " руб");
    }
}