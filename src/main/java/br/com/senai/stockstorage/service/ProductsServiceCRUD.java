package br.com.senai.stockstorage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.stockstorage.orm.Products;
import br.com.senai.stockstorage.repository.ProductsRepository;

@Service
public class ProductsServiceCRUD implements ProductsService {
    @Autowired
    private ProductsRepository repository;

    @Override
    public List<Products> showProducts() {
        return (List<Products>) repository.findAll();
    } 

    public void deleteProducts(Integer id) {
        repository.deleteById(id);
    }

    public Products saveProducts(Products products) {
        return repository.save(products);
    }

    public Products queryProductsId(Integer id) {
        return repository.findById(id).get();
    }

    public Products updateProducts(Products products) {
        return repository.save(products);
    }
}
