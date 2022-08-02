package br.com.senai.stockstorage.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;


@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 32)
    private String name;

    @Column(length = 32)
    private String type;

    @Column(columnDefinition = "smallint")
    private Integer quantity;

    @Column(columnDefinition = "smallint")
    private Integer removed = 0;

    @Column(columnDefinition = "smallint")
    private Integer minimum;

    @Column(columnDefinition = "decimal(9, 2)")
    private Double price;

    @Column(length = 32)
    private String location;

    @Column(length = 32)
    private String supplier;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getRemoved() {
        return this.removed;
    }

    public void setRemoved(Integer removed) {
        this.removed = removed;
    }

    public Integer getMinimum() {
        return this.minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}