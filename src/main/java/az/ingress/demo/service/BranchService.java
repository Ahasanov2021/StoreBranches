package az.ingress.demo.service;

import az.ingress.demo.dto.BranchRequest;
import az.ingress.demo.dto.BranchResponse;
import az.ingress.demo.model.Branch;
import az.ingress.demo.model.Store;
import az.ingress.demo.repository.BranchRepository;
import az.ingress.demo.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BranchService {

    private final BranchRepository branchRepository;
    private final StoreRepository storeRepository;
    private final ModelMapper modelMapper;

    public BranchResponse create(Long storeId, BranchRequest request) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new RuntimeException("Market with id" + storeId + "not found!"));
        Branch branch = modelMapper.map(request, Branch.class);
        branch.setStore(store);
        store.getBranches().add(branch);
        storeRepository.save(store);
        return modelMapper.map(branch, BranchResponse.class);
    }

    public BranchResponse update(Long storeId, Long branchId, BranchRequest request) {
    return null;
    }
}
