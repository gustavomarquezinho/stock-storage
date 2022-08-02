package br.com.senai.stockstorage.service;

import java.util.List;
import br.com.senai.stockstorage.orm.Products;

public interface ProductsService {
    public List<Products> showProducts();
    public void deleteProducts(Integer id);

    public Products saveProducts(Products products);
    public Products queryProductsId(Integer id);
    public Products updateProducts(Products products);
}
