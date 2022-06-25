package cs545_lab3_spring_data.controller;


import cs545_lab3_spring_data.dto.ReviewDto;
import cs545_lab3_spring_data.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {


    private final ReviewService reviewService;


@GetMapping(path = "{id}")
    public List<ReviewDto> findAllReviewsByProductId(@PathVariable("id")int productId) {
        return  reviewService.findAllReviewsByProductId(productId);
    }
}
