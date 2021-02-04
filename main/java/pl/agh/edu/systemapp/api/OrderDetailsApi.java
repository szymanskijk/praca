package pl.agh.edu.systemapp.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.edu.systemapp.dao.entity.OrderDetails;
import pl.agh.edu.systemapp.dao.entity.Product;
import pl.agh.edu.systemapp.manager.OrderDetailsManager;

import javax.persistence.criteria.Order;
import java.util.Optional;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsApi {

    private OrderDetailsManager orderDetailsManager;

    @Autowired
    public OrderDetailsApi (OrderDetailsManager orderDetailsManager) { this.orderDetailsManager = orderDetailsManager; }

    @GetMapping("/all")
    public Iterable<OrderDetails> getAll() { return orderDetailsManager.findAll(); }

    @GetMapping
    public Optional<OrderDetails> getById(@RequestParam Long id) { return orderDetailsManager.findById(id); }

    @PostMapping
    public OrderDetails addOrderDetails(@RequestParam OrderDetails orderDetails) { return orderDetailsManager.save(orderDetails); }

    @PutMapping
    public OrderDetails updateOrderDetails(@RequestBody OrderDetails orderDetails){
        return orderDetailsManager.save(orderDetails);
    }

    @DeleteMapping
    public void deleteOrderDetails(@RequestParam Long id){
        orderDetailsManager.deleteById(id);
    }

}
