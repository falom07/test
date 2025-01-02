package Hibernate.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "listUser")
@EqualsAndHashCode(exclude = "listUser")
@Builder
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "work",orphanRemoval = true)
    private Set<User> listUser;
}
