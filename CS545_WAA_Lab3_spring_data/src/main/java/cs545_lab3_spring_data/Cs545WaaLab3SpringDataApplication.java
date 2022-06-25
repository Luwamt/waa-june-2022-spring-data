package cs545_lab3_spring_data;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Cs545WaaLab3SpringDataApplication {

    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
    public static void main(String[] args) {
        SpringApplication.run(Cs545WaaLab3SpringDataApplication.class, args);
    }

}
