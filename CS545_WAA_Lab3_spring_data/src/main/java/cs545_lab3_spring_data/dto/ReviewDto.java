package cs545_lab3_spring_data.dto;

import cs545_lab3_spring_data.entity.User;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ReviewDto {
    private Long id;
    private String comment;
    private User user;
}
