package pl.agh.edu.systemapp.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.agh.edu.systemapp.dao.entity.Product;
import pl.agh.edu.systemapp.dao.ProductRepo;

import java.util.Optional;

@Service
public class ProductManager {

    private ProductRepo productRepo;

    @Autowired
    public ProductManager(ProductRepo productRepo) { this.productRepo = productRepo; }

    public Optional<Product> findById(Long id) { return productRepo.findById(id); }

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public Product save(Product product){
        return productRepo.save(product);
    }

    public void deleteById(Long id){
        productRepo.deleteById(id);
    }

    public Product changeStock(Integer count, Long id) {
        Product currentProduct = productRepo.findById(id).get();
        Integer currentStock = currentProduct.getStock();
        currentProduct.setStock(currentStock-count);
        return productRepo.save(currentProduct);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new Product("Nazwa Produktu", 350, 12, "Typ produktu"));
    }

}
