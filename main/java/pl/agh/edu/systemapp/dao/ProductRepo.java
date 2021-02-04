package pl.agh.edu.systemapp.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.agh.edu.systemapp.dao.entity.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
}
