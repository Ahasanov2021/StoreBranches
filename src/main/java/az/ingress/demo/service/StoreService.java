package az.ingress.demo.service;

import az.ingress.demo.dto.StoreRequest;
import az.ingress.demo.dto.StoreResponse;
import az.ingress.demo.model.Store;
import az.ingress.demo.repository.StoreRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;
    private final ModelMapper modelMapper;

    public StoreResponse create(StoreRequest request) {
        Store store = modelMapper.map(request, Store.class);
        storeRepository.save(store);
        return modelMapper.map(store, StoreResponse.class);
    }

    @Transactional
    public StoreResponse get(Long storeId) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new RuntimeException("Market with id" + storeId + "not found!"));
        return modelMapper.map(store, StoreResponse.class);

    }

    public void delete(Long storeId) {
        storeRepository.deleteById(storeId);
    }
}
