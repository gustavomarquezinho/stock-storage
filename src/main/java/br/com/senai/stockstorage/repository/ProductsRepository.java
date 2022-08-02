package br.com.senai.stockstorage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.stockstorage.orm.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
