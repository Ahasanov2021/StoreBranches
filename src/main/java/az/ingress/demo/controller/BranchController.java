package az.ingress.demo.controller;

import az.ingress.demo.dto.BranchRequest;
import az.ingress.demo.dto.BranchResponse;
import az.ingress.demo.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class BranchController {

    private final BranchService branchService;

    @PostMapping("/{storeId}")
    public BranchResponse create(@PathVariable Long storeId, @RequestBody BranchRequest request){
        return branchService.create(storeId, request);
    }

    @PutMapping("/{storeId}/branch/{branchId}")
    public BranchResponse update(@PathVariable Long storeId,
                                 @PathVariable Long branchId,
                                 @RequestBody BranchRequest request){
        return branchService.update(storeId, branchId, request);
    }
}
