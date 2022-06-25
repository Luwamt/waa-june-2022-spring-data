package cs545_lab3_spring_data.repository;

import cs545_lab3_spring_data.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Long> {
}
