package az.ingress.demo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "store")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String type;

    // creates separate table store_branches with columns store_id and branches_id when not using mappedBy
    @OneToMany(mappedBy = "store")
    @Builder.Default
    List<Branch> branches = new ArrayList<>();
}
