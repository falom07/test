package Hibernate.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "users")
@RequiredArgsConstructor(staticName = "of")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "work")

    private Company work;
    @Column
    @NonNull
    private String name;


}
