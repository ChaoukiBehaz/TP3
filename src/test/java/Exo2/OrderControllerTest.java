package Exo2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class OrderControllerTest {

    @Test
    public void createOrderTest(){
        OrderService MockOrderService = mock(OrderService.class);
        OrderDao MockOrderDao = mock(OrderDao.class);
        MockOrderService.setOdao(MockOrderDao);
        OrderController orderController = new OrderController();
        orderController.setOrderService(MockOrderService);


        Order or = new Order();

        when(MockOrderService.createOrder(or)).thenReturn(true);

        boolean TestBoolean = orderController.createOrder(or);
        assertEquals(true, TestBoolean);
        verify(MockOrderService).createOrder(or);
        //verify(MockOrderDao).saveOrder(or);


    }
}