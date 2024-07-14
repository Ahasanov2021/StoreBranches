package az.ingress.demo.repository;

import az.ingress.demo.model.Branch;
import az.ingress.demo.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {

}
