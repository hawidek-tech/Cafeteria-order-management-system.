
class Drink extends MenuItem {

    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Drink: " + getName() + " | Price: " + getPrice());
    }
}
