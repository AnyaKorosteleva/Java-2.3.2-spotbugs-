public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonus = service.calculate(1000_60, false);

        System.out.println(bonus);
    }
}