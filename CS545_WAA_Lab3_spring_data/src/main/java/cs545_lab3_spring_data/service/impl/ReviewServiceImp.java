package cs545_lab3_spring_data.service.impl;

import cs545_lab3_spring_data.dto.ProductDto;
import cs545_lab3_spring_data.dto.ReviewDto;
import cs545_lab3_spring_data.entity.Product;
import cs545_lab3_spring_data.entity.Review;
import cs545_lab3_spring_data.repository.ProductRepo;
import cs545_lab3_spring_data.repository.ReviewRepo;
import cs545_lab3_spring_data.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ReviewServiceImp implements ReviewService {

private final ProductRepo productRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<ReviewDto> findAllReviewsByProductId(int productId) {
        List<ReviewDto> review = new ArrayList<>();
        for (Product product: productRepo.findAll()){
            if (product.getId()==productId){
                for (Review r :product.getReviews()){
                    review.add(modelMapper.map(r,ReviewDto.class));
                }
            }
        }
        return review;
    }
}
