package pl.agh.edu.systemapp.manager;


import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.agh.edu.systemapp.dao.OrderDetailsRepo;
import pl.agh.edu.systemapp.dao.entity.OrderDetails;

import java.util.Optional;

@Service
public class OrderDetailsManager {

    private OrderDetailsRepo orderDetailsRepo;

    @Autowired
    public OrderDetailsManager(OrderDetailsRepo orderDetailsRepo) { this.orderDetailsRepo = orderDetailsRepo; }

    public Optional<OrderDetails> findById(Long id) { return orderDetailsRepo.findById(id); }

    public Iterable<OrderDetails> findAll() { return orderDetailsRepo.findAll(); }

    public OrderDetails save (OrderDetails orderDetails) { return orderDetailsRepo.save(orderDetails); }

    public void deleteById(Long id) { orderDetailsRepo.deleteById(id); }

}
