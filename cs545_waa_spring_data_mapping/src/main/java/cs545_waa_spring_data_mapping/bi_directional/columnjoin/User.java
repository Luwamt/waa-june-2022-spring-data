package cs545_lab3_spring_data.entity.bi_directional.columnjoin;


import cs545_lab3_spring_data.entity.bi_directional.columnjoin.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @OneToMany//(mappedBy = "user")
    //@JoinColumn
    private List<Review> reviews;
    @JoinColumn
    @OneToOne//(mappedBy ="user")
    private Address address;
}
