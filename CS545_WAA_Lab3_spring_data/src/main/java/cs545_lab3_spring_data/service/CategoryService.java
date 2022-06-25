package cs545_lab3_spring_data.service;

import cs545_lab3_spring_data.dto.ProductDto;

import java.util.List;

public interface CategoryService {

    List<ProductDto> findAllProductsByCategory(String category,double max);
}
