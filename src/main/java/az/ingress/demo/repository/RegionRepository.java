package az.ingress.demo.repository;

import az.ingress.demo.model.Address;
import az.ingress.demo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {


}
