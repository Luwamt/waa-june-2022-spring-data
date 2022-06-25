package cs545_lab3_spring_data.dto;

import cs545_lab3_spring_data.entity.Category;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProductDto {
    private Long id;
    private String name;
    private int rating;
    private double price;
    private Category category;
}
