package Exo2;

public class OrderController {
    OrderService OrderService;
    public Order createOrder(Order Order){
        OrderService.createOrder(Order);
        return Order;
    };
}
