package Exo2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class OrderControllerTest {
    OrderService MockOrderService = mock(OrderService.class);
    @Test
    public void createOrderTest(){
        Order or = new Order();
        MockOrderService.createOrder(or);
}
}