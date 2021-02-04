package pl.agh.edu.systemapp.dao.entity;


import javax.persistence.*;

@Entity
@Table(name="Products")
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    private String name;
    private Integer price;
    private Integer stock;
    private String type;

    public Product() {
    }

    public Product(String name, Integer price, Integer stock, String type) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
