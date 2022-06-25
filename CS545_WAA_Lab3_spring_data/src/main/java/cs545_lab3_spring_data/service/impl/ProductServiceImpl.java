package cs545_lab3_spring_data.service.impl;

import cs545_lab3_spring_data.dto.ProductDto;
import cs545_lab3_spring_data.entity.Product;
import cs545_lab3_spring_data.entity.User;
import cs545_lab3_spring_data.repository.ProductRepo;
import cs545_lab3_spring_data.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private final ProductRepo productRepo;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDto> getAllProductByMinPrice(double min) {
        List<ProductDto> dto = new ArrayList<>();

        for(Product product : productRepo.findAll()) {
            if (product.getPrice() > min) {
       var  model= modelMapper.map(dto, ProductDto.class);
                dto.add(model);
            }
        }
        return dto;
    }

    @Override
    public List<ProductDto> getAllProductByKeyword(String keyword) {
        List<ProductDto> word = new ArrayList<>();
        for (Product p : productRepo.findAll()) {
            if (p.getName().contains(keyword)) {
                var model = modelMapper.map(word, ProductDto.class);
                word.add(model);
            }
        }
        return word;
    }

    /**
     * need to update
     * @param max
     * @return
     */
    @Override
    public List<ProductDto> getAllProductByMaxPrice(double max) {
        List<ProductDto> products = new ArrayList<>();
        for(Product p :productRepo.findAll()){
            if(p.getPrice()<max){
                var model=modelMapper.map(products,ProductDto.class);
                products.add(model);
            }

        }
        return products;
    }


}