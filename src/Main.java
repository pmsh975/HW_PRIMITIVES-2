public class Main {
    public static void main(String[] args) {

        int account = 100; // начальный счет

        int payment = 1100; // сумма пополнения

        int limit = 1000; // сумма от которой начисляются бонусы

        if (payment > limit) {
            int bonus = payment / 100; // кол-во бонусов
            int total = account + bonus + payment; // итоговая сумма на счету
            System.out.println("Вам начислено " + bonus + " бонусных рублей" + ", итоговая сумма на счету " + total + " рублей.");
        } else {
            int bonus = 0;
            int total = account + payment;
            System.out.println("Бонусов нет" + ", итоговая сумма на счету " + total + " рублей.");
        }

    }
}
