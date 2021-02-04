package pl.agh.edu.systemapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.edu.systemapp.dao.entity.Orderre;
import pl.agh.edu.systemapp.manager.OrderManager;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderreApi {

    private OrderManager orderManager;

    @Autowired
    public OrderreApi(OrderManager orderManagers){
        this.orderManager = orderManagers;
    }

    @GetMapping("/all")
    public Iterable<Orderre> getAll(){
        return orderManager.findAll();
    }

    @GetMapping
    public Optional<Orderre> getById(@RequestParam Long id) {
        return orderManager.findById(id);
    }

    @PostMapping
    public Orderre addOrderre(@RequestBody Orderre order){
        return orderManager.save(order);
    }

    @PutMapping
    public Orderre updateOrderre(@RequestBody Orderre order){
        return orderManager.save(order);
    }

    @DeleteMapping
    public void deleteOrderre(@RequestParam Long id){
        orderManager.deleteById(id);
    }

    @GetMapping("/clientid")
    public Iterable<Orderre> getByClientId(@RequestParam Long id) { return orderManager.getOrderreByClient(id);}

}