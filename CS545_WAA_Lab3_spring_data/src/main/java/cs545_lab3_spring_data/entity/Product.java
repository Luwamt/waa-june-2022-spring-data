package cs545_lab3_spring_data.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int rating;
    private double price;
    @JsonManagedReference
    @ManyToOne
    private Category category;
    @ManyToOne
    private User userp;
    @OneToMany(mappedBy = "products")
    private List<Review> reviews;
}
