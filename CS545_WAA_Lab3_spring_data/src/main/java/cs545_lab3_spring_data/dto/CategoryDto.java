package cs545_lab3_spring_data.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import cs545_lab3_spring_data.entity.Product;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.OneToMany;
import java.util.List;

@Data
@Component
public class CategoryDto {
    private Long id;
    private String name;
    private List<Product> products;
}
