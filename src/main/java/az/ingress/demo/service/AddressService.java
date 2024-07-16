package az.ingress.demo.service;

import az.ingress.demo.dto.AddressRequest;
import az.ingress.demo.dto.AddressResponse;
import az.ingress.demo.model.Address;
import az.ingress.demo.model.Branch;
import az.ingress.demo.repository.AddressRepository;
import az.ingress.demo.repository.BranchRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;
    private final BranchRepository branchRepository;
    private final ModelMapper modelMapper;

    public AddressResponse create(Long branchId, AddressRequest request) {
        Branch branch = branchRepository.findById(branchId)
                .orElseThrow(()-> new RuntimeException(String.format("Branch with id" + branchId + "not found.")));
        Address address = modelMapper.map(request, Address.class);
        branch.setAddress(address);
        branchRepository.save(branch);
        return modelMapper.map(address, AddressResponse.class);
    }
}
