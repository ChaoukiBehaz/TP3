package Exo2;

public class OrderController {
    OrderService OrderService;

    public void setOrderService(Exo2.OrderService orderService) {
        OrderService = orderService;
    }

    public boolean createOrder(Order Order){
        return OrderService.createOrder(Order);
    };
}
