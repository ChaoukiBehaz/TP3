package Exo2;

public class OrderService {
    OrderDao Odao;

    public void setOdao(OrderDao odao) {
        Odao = odao;
    }

    public boolean createOrder(Order order){
        return Odao.saveOrder(order);
    }
}
