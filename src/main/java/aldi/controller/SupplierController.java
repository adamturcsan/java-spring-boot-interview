package aldi.controller;

import aldi.entity.Supplier;
import aldi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/suppliers")
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping
    public List<Supplier> getSuppliers() {
        return supplierService.getSuppliers();
    }

    @PostMapping
    public ResponseEntity<Supplier> createSupplier(@RequestBody Supplier supplier) {
        Supplier createdSupplier = supplierService.createSupplier(supplier);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSupplier);
    }

    @DeleteMapping(path = "{supplierId}")
    public void deleteSupplier(@PathVariable("supplierId") Long supplierId) {
        supplierService.deleteSupplier(supplierId);
    }

    @PutMapping(path = "{supplierId}")
    public void updateSupplier(
            @PathVariable("supplierId") Long supplierId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ) {
        supplierService.updateSupplier(supplierId, name, email);
    }
}
