package az.ingress.demo.dto;

import az.ingress.demo.model.Branch;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StoreResponse {

    Long id;

    String name;

    String type;

    List<BranchResponse> branches = new ArrayList<>();

}
