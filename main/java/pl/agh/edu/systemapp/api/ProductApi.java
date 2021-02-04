package pl.agh.edu.systemapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.edu.systemapp.dao.entity.Product;
import pl.agh.edu.systemapp.manager.ProductManager;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductApi {

    private ProductManager productManager;

    @Autowired
    public ProductApi(ProductManager productManagers){
        this.productManager = productManagers;
    }

    @GetMapping("/all")
    public Iterable<Product> getAll(){
        return productManager.findAll();
    }

    @GetMapping
    public Optional<Product> getById(@RequestParam Long id) {
        return productManager.findById(id);
    }

    @PostMapping
    public Product addClient(@RequestBody Product product){
        return productManager.save(product);
    }

    @PutMapping
    public Product updateClient(@RequestBody Product product){
        return productManager.save(product);
    }

    @DeleteMapping
    public void deleteClient(@RequestParam Long id){
        productManager.deleteById(id);
    }

}