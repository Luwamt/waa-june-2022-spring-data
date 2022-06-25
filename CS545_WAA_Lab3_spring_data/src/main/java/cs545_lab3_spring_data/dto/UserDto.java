package cs545_lab3_spring_data.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import cs545_lab3_spring_data.entity.Address;
import cs545_lab3_spring_data.entity.Product;
import cs545_lab3_spring_data.entity.Review;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@Component
public class UserDto {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private List<Review> reviews;
    private Address address;
    private List<Product> products;
}

