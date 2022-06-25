package cs545_lab3_spring_data.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;

    @OneToMany(mappedBy = "usersi",fetch = FetchType.LAZY)
    @JsonManagedReference
    //@JoinColumn
    private List<Review> reviews;
    //@JoinColumn
    @OneToOne(mappedBy ="user")
    private Address address;
    @OneToMany(mappedBy = "userp")
    private List<Product> products;
}
