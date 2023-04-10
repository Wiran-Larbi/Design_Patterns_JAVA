import java.util.Collection;
import java.util.Iterator;

public class SummaryPrinter implements OrderPrinter{

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("***************** SUMMARY REPORT *****************");
        Iterator<Order> iterator = orders.iterator();
        int index = 1;
        double total = 0.0;

        while(iterator.hasNext()){
            Order order = iterator.next();
            System.out.println(index + " . order ° " + order.getId());
            System.out.println("\t date : " + order.getDate() + "\t n°ELements : " + order.getItems().size() + "\t Total Cost : " + order.getTotal());
            total += order.getTotal();
        }
        System.out.println("**************************************************");
    }
}
