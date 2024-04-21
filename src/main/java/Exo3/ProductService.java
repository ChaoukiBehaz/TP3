package Exo3;

public class ProductService {
    ProductApiClient ProductApiClient;

    public void setProductApiClient(Exo3.ProductApiClient productApiClient) {
        ProductApiClient = productApiClient;
    }

    public Product getProduct(String  productId){
       return ProductApiClient.getProduct(productId);
    }
}
