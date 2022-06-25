package cs545_lab3_spring_data.service.impl;

import cs545_lab3_spring_data.dto.ProductDto;
import cs545_lab3_spring_data.entity.User;
import cs545_lab3_spring_data.repository.UserRepo;
import cs545_lab3_spring_data.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

private final UserRepo userRepo;
private final ModelMapper modelMapper;
    @Override
    public List<ProductDto> getAllCreateProductsByUserId(int userId) {
        List<ProductDto> products = new ArrayList<>();
        for(User user :userRepo.findAll())
            if(user.getId() == userId) {
                products.add(modelMapper.map(products, ProductDto.class));
            }
        return products;
    }
}
