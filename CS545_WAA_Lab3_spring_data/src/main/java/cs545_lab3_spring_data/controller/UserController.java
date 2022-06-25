package cs545_lab3_spring_data.controller;

import cs545_lab3_spring_data.dto.ProductDto;
import cs545_lab3_spring_data.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping(path = "{id}")
    public List<ProductDto> getAllCreateProductsByUserId(@PathVariable("id") int userId) {
        return userService.getAllCreateProductsByUserId(userId);
    }

}
