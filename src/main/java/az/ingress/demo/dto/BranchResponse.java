package az.ingress.demo.dto;

import az.ingress.demo.model.Address;
import az.ingress.demo.model.Store;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BranchResponse {

    Long id;

    String name;

    Integer countOfEmployee;

    Address address;

}
