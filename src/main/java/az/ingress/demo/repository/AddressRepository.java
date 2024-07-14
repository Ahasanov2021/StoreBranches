package az.ingress.demo.repository;

import az.ingress.demo.model.Address;
import az.ingress.demo.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {


}
