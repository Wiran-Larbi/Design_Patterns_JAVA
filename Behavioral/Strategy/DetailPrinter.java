import org.w3c.dom.ls.LSOutput;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class DetailPrinter implements OrderPrinter{
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("********************* DETAILED REPORT *********************");
        Iterator<Order> iterator = orders.iterator();
        double total = 0;
        double orderTotal = 0;
        int index = 1;
        while(iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(index + ". " + order.getId() + " \t" + order.getDate());
            for(Map.Entry<String, Double> entry : order.getItems().entrySet()) {
                System.out.println("\t\t" + entry.getKey() + "\t" + entry.getValue());
                orderTotal += entry.getValue();
            }

                    System.out.println("----------------------------------------------------------");
                    System.out.println("\t\t TOTAL : "+orderTotal);
                    System.out.println("----------------------------------------------------------");
                    total += orderTotal;
                    orderTotal = 0;

            }
        System.out.println("----------------------------------------------------------");
        System.out.println("\tGRAND TOTAL : "+total);
        System.out.println("**********************************************************");
        }




    }

