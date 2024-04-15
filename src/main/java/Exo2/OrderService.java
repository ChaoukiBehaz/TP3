package Exo2;

public class OrderService {
    OrderDao Odao;
    public boolean createOrder(Order Order){
    Order order = new Order();
        return Odao.saveOrder(order);
    }
}
