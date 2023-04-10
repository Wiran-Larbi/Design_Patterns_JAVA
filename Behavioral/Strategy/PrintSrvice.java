import java.util.LinkedList;

public class PrintSrvice {

    private OrderPrinter printer;

    //* Choosing and Deciding the Strategy that will be used
    public PrintSrvice(OrderPrinter printer){
        this.printer = printer;
    }
    //* Delegate the execution
    public void printOrders(LinkedList<Order> orders){
        this.printer.print(orders);
    }
}
