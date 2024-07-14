package az.ingress.demo;


import az.ingress.demo.model.Address;
import az.ingress.demo.model.Branch;
import az.ingress.demo.model.Store;
import az.ingress.demo.repository.AddressRepository;
import az.ingress.demo.repository.BranchRepository;
import az.ingress.demo.repository.StoreRepository;
import jakarta.persistence.EntityManagerFactory;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

	private final StoreRepository storeRepository;
	private final BranchRepository branchRepository;
	private final AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

//		Store store = Store.builder()
//				.name("Bravo")
//				.type("Hyper")
//				.build();
//		storeRepository.save(store);
//
//		Branch korogluBranch = Branch.builder()
//				.name("Koroglu")
//				.countOfEmployee(98)
//				.store(store)
//				.build();
//
//		Branch ahmadliBranch = Branch.builder()
//				.name("Ahmadli")
//				.countOfEmployee(132)
//				.store(store)
//				.build();
//
//		store.getBranches().add(korogluBranch);
//		store.getBranches().add(ahmadliBranch);
//
//		storeRepository.save(store);
//		branchRepository.save(korogluBranch);
//		branchRepository.save(ahmadliBranch);
//
//		Address address1 = Address.builder()
//				.name("H.Aliyev pr, 20")
//				.build();
//
//		Address address2 = Address.builder()
//				.name("Ahmadli m/s, 115")
//				.build();
//
//		korogluBranch.setAddress(address1);
//		ahmadliBranch.setAddress(address2);
//
//		addressRepository.save(address1);
//		addressRepository.save(address2);
//
//		branchRepository.save(korogluBranch);
//		branchRepository.save(ahmadliBranch);

//		storeRepository.findAll().forEach(System.out::println);


	}
}
