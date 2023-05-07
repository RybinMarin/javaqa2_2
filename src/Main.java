public class Main {
    public static void main(String[] args) {
        int bill = 100; // Сумма на счету у клиента
        int amount = 1100; // Сумма пополнения

        int bonus = amount/ 100; // Начислено бонусов за пополнение счета
        if (amount < 1000) {
            bonus = 0;
        }

        int summ = bill + amount + bonus;

        System.out.println("Итоговый счет:" + summ);
        System.out.println("Количество бонусных рублей:" + bonus);
        }
    }