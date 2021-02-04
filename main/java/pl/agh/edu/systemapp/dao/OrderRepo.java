package pl.agh.edu.systemapp.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.agh.edu.systemapp.dao.entity.Orderre;

import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Orderre, Long> {
    public List<Orderre> findByClientId(String clientId);
}