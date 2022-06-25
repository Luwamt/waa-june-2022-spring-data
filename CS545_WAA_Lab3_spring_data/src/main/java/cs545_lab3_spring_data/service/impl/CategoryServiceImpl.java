package cs545_lab3_spring_data.service.impl;

import cs545_lab3_spring_data.dto.ProductDto;
import cs545_lab3_spring_data.entity.Category;
import cs545_lab3_spring_data.entity.Product;
import cs545_lab3_spring_data.repository.CategoryRepo;
import cs545_lab3_spring_data.repository.ProductRepo;
import cs545_lab3_spring_data.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private final CategoryRepo categoryRepo;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDto> findAllProductsByCategory(String category,double max) {
        List<ProductDto> dto = new ArrayList<>();
        for (Category cate: categoryRepo.findAll()){
            if (cate.getName().equalsIgnoreCase(category))
                for (Product p : cate.getProducts()){
                    if (p.getPrice() < max){
                        dto.add(modelMapper.map(p,ProductDto.class));
                    }
                }

        }

        return dto;
    }
}
