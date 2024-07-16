package az.ingress.demo;


import az.ingress.demo.model.*;
import az.ingress.demo.repository.AddressRepository;
import az.ingress.demo.repository.BranchRepository;
import az.ingress.demo.repository.RegionRepository;
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
	private final RegionRepository regionRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		Store bravo = storeRepository.findById(1L).get();
		Store araz = storeRepository.findById(3L).get();


		Region agdam = Region.builder()
				.name(RegionType.AGDAM)
				.build();

		Region absheron = Region.builder()
				.name(RegionType.ABSHERON)
				.build();

		regionRepository.save(absheron);
		regionRepository.save(agdam);

		bravo.getRegions().add(absheron);
		bravo.getRegions().add(agdam);
		araz.getRegions().add(absheron);
		araz.getRegions().add(agdam);

		storeRepository.save(bravo);
		storeRepository.save(araz);

//		System.out.println(storeRepository.findById(1L).get());
//
//		Store store = Store.builder()
//				.name("Araz")
//				.type("Supermarket")
//				.build();
//
//		Branch yasamalBranch = Branch.builder()
//				.name("Yasamal")
//				.countOfEmployee(76)
//				.store(store)
//				.build();
//
//		Branch narimanovBranch = Branch.builder()
//				.name("Narimanov")
//				.countOfEmployee(152)
//				.store(store)
//				.build();
//
//		store.getBranches().add(yasamalBranch);
//		store.getBranches().add(narimanovBranch);
//
//		Address address1 = Address.builder()
//				.name("Inshaatchilar m/s, 115")
//				.build();
//
//		Address address2 = Address.builder()
//				.name("Narimanov m/s, 11")
//				.build();
//
//		yasamalBranch.setAddress(address1);
//		narimanovBranch.setAddress(address2);
//
//		storeRepository.save(store);


	}
}
