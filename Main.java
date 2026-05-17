public class Main {
    public static void main(String[] args) {

        MenuItem food1 = new Food("Burger", 120);
        MenuItem drink1 = new Drink("Coke", 30);

        Order order1 = new Order("Hawi", food1);
        Order order2 = new Order("Nejma", drink1);

        System.out.println("=== Orders ===");
        order1.showOrder();
        order2.showOrder();
    }
}
