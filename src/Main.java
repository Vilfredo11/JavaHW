public class Main {
    public static void main(String[] args) {
        int amount = 10_000;
        int percent = 5;
        System.out.println(percent);
        int bonus = amount / 100 * percent;
        if (amount > 20) {
            bonus = amount / 100 * percent;
        }
        System.out.println("Стоимость билета: " + amount);
        System.out.println("Процент: " + percent);
        System.out.println("Итоговый бонус: " + bonus);

    }
}