package pl.agh.edu.systemapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.agh.edu.systemapp.dao.entity.Client;

import java.util.List;

@Repository
public interface ClientRepo extends CrudRepository<Client, Long> {
}
