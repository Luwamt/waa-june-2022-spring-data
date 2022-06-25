package cs545_lab3_spring_data.entity.bi_directional.tablejoin;


import cs545_lab3_spring_data.entity.bi_directional.tablejoin.Review;
import cs545_lab3_spring_data.entity.uni_directional.jointable.Address;
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany
    @JoinTable
    private List<Review> reviews;
    @OneToOne
    @JoinTable
    private Address address;
}
