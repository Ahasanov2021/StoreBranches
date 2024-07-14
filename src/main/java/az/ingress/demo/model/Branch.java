package az.ingress.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "branch")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    Integer countOfEmployee;

    @JsonIgnore
    @ManyToOne
    @ToString.Exclude
    Store store;

    @OneToOne
    Address address;
}
