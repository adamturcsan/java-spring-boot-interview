package aldi.repository;

import aldi.entity.Supplier;
import aldi.projection.SupplierProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    @Query("SELECT s FROM Supplier s WHERE s.email = ?1")
    Optional<Supplier> findSupplierByEmail(String email);

    @Query("SELECT s FROM Supplier s")
    List<SupplierProjection> findAllSuppliersProjected();
}
