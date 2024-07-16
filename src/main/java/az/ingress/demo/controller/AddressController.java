package az.ingress.demo.controller;

import az.ingress.demo.dto.AddressRequest;
import az.ingress.demo.dto.AddressResponse;
import az.ingress.demo.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branch")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping("/{branchId}")
    public AddressResponse create(@PathVariable Long branchId, @RequestBody AddressRequest request){
        return addressService.create(branchId, request);
    }

}
