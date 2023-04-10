import java.util.LinkedList;

public class Client {

    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        // * Calling Useful Method
        createOrders();

        // * Printing Orders
        // ? Using Strategy Design Pattern to choose method of Printing
        PrintSrvice service = new PrintSrvice(new DetailPrinter());
        service.printOrders(orders);

    }

    public static void createOrders() {
        //* Instantiation
        Order order1 = new Order("1");
        order1.addItem("Organic Bananas",9);
        order1.addItem("Whole Grain Bread", 3.5);
        order1.addItem("Ground Beef",23);
        Order order2 = new Order("2");
        order2.addItem("Eggs",1.1);
        order2.addItem("Milk", 3.5);
        order2.addItem("Fresh Strawberries",5.6);
        Order order3 = new Order("3");
        order3.addItem("Brown Rice",4.5);
        order3.addItem("Canned Black Beans", 5);
        order3.addItem("Organic Mixed Vegetables",8);

        //* Adding Orders
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);



    }
}
