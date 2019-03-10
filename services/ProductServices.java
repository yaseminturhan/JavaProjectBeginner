package services;

import java.util.List;

public interface ProductServices {

    void deleteProduct(int id);
    void addProduct();
    List<String> listProduct();


}