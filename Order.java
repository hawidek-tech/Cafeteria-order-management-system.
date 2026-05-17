
class Order {
    private String customerName;
    private MenuItem item;

    public Order(String customerName, MenuItem item) {
        this.customerName = customerName;
        this.item = item;
    }

    public void showOrder() {
        System.out.println(customerName + " ordered:");
        item.display();
    }
}
