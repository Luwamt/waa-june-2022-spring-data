package cs545_lab3_spring_data.controller;

import cs545_lab3_spring_data.dto.ProductDto;
import cs545_lab3_spring_data.service.CategoryService;
import cs545_lab3_spring_data.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")

public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categories/filterPrice")
    public List<ProductDto> findAllProductsByCategory(String category,double max){
       return categoryService.findAllProductsByCategory(category,max);
    }
}
