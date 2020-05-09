public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 17000; // цена билета
        int miles = service.calculate(price);
        System.out.println("Количество бонусов = " + miles);
    }
}
