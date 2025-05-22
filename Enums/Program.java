package Enums;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.Pending_Payment);
        System.out.println(order);
        OrderStatus os1= OrderStatus.Delivered;
        OrderStatus os2 = OrderStatus.valueOf("Delivered");
        System.out.println(os1);
        System.out.println(os2);
    }
}
