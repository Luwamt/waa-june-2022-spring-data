package cs545_lab3_spring_data.entity.uni_directional.joincolumn;


import cs545_lab3_spring_data.entity.uni_directional.jointable.Address;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @OneToMany
    @JoinColumn(name = "id_user")
    private List<Review> reviews;
    @OneToOne
    @JoinColumn(name = "id_user")
    private Address address;
}
