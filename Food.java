
class Food extends MenuItem {

    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Food: " + getName() + " | Price: " + getPrice());
    }
}
