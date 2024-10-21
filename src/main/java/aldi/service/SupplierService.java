package aldi.service;

import aldi.entity.Supplier;
import aldi.projection.SupplierProjection;
import aldi.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(SupplierRepository supplierRepositoryRepository) {
        this.supplierRepository = supplierRepositoryRepository;
    }

    public List<Supplier> getSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public void deleteSupplier(Long supplierId) {
        supplierRepository.deleteById(supplierId);
    }

    public void updateSupplier(
            Long supplierId,
            String name,
            String email
    ) {
        Supplier supplier = supplierRepository.findById(supplierId)
                .orElseThrow(() -> new IllegalStateException(
                        "supplier with id " + supplierId + " does not exists"
                ));

        if (
                name != null
                        && !name.isEmpty()
                        && !Objects.equals(supplier.getName(), name)) {
            supplier.setName(name);
        }

        if (
            email != null
            && !email.isEmpty()
            && !Objects.equals(supplier.getEmail(), email)
        ) {
            Optional<Supplier> supplierOptional = supplierRepository.findSupplierByEmail(email);

            if (supplierOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }

            supplier.setEmail(email);
        }
    }

}
