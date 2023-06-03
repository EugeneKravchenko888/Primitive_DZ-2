public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int pay = 1700;
        int popolnenie = balance + pay;
        int bonus = popolnenie / 100;

        if (popolnenie > 1000) {
            System.out.println("Итоговый счёт с бонусом составляет: ");
            System.out.println(bonus + popolnenie);
            System.out.println("Начислено бонусов: ");
            System.out.println(bonus);
        } else {
            System.out.println("Итоговый счёт составляет: ");
            System.out.println(balance + pay);
            System.out.println("Извините бонусы не зачислены, ждём полной оплаты");
            System.out.println("Ваш оператор ООО 'STOLEN'");
        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}