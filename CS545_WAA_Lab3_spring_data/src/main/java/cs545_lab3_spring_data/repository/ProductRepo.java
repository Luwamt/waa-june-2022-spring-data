package cs545_lab3_spring_data.repository;

import cs545_lab3_spring_data.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product,Long> {
}
