package pl.agh.edu.systemapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.agh.edu.systemapp.dao.OrderRepo;
import pl.agh.edu.systemapp.dao.entity.Orderre;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderManager {


    private OrderRepo orderRepo;
    @Autowired
    public OrderManager(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

    public Optional<Orderre> findById(Long id){
        return orderRepo.findById(id);
    }

    public Iterable<Orderre> findAll(){
        return orderRepo.findAll();
    }

    public Orderre save(Orderre order){
        return orderRepo.save(order);
    }

    public void deleteById(Long id){
        orderRepo.deleteById(id);
    }

    public List<Orderre> getOrderreByClient(Long id){
        List<Orderre> orders = new ArrayList<>();
        orderRepo.findByClientId(id).forEach(orders::add);
        return orders;
    }
}