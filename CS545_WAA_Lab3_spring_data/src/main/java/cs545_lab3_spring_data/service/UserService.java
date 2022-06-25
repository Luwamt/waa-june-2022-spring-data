package cs545_lab3_spring_data.service;

import cs545_lab3_spring_data.dto.ProductDto;
import cs545_lab3_spring_data.dto.ReviewDto;

import java.util.List;

public interface UserService {

    List<ProductDto> getAllCreateProductsByUserId(int userId);
}
