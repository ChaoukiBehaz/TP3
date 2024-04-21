package Exo3;

import Exo1.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    @Test
    void getProduct() {
        ProductApiClient mockProductApiClient = mock(ProductApiClient.class);

        Product P = new Product();
        P.setName("Product1");
        P.setId("04");

        when(mockProductApiClient.getProduct("04")).thenReturn(P);

        ProductService Ps = new ProductService();
        Ps.setProductApiClient(mockProductApiClient);
        Product Presult = Ps.getProduct("04");

        assertEquals(P,Presult);

        verify(mockProductApiClient).getProduct(P.getId());


        when(mockProductApiClient.getProduct("789")).thenThrow(new RuntimeException("API Error"));
        assertThrows(RuntimeException.class, () -> mockProductApiClient.getProduct("789"));

    }
}