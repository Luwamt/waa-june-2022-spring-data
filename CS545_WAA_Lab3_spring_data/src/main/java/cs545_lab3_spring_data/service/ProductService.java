package cs545_lab3_spring_data.service;

import cs545_lab3_spring_data.dto.ProductDto;
import cs545_lab3_spring_data.entity.Product;

import java.util.List;

public interface ProductService {

     List<ProductDto> getAllProductByMinPrice(double min);

     List<ProductDto> getAllProductByMaxPrice(double max);

     List<ProductDto> getAllProductByKeyword(String keyword);

    // List<ProductDto> getAllByUserId(int userId);


}
