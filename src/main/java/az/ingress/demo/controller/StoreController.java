package az.ingress.demo.controller;

import az.ingress.demo.dto.StoreRequest;
import az.ingress.demo.dto.StoreResponse;
import az.ingress.demo.service.StoreService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    @PostMapping
    public StoreResponse create(@RequestBody @Valid StoreRequest request){
        return storeService.create(request);
    }

    @GetMapping("/{storeId}")
    public StoreResponse get(@PathVariable Long storeId) {
        return storeService.get(storeId);
    }

    @DeleteMapping("/{storeId}")
    public void delete(@PathVariable Long storeId) {
        storeService.delete(storeId);
    }

}
