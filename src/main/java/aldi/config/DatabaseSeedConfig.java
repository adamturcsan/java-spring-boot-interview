package aldi.config;

import aldi.entity.Supplier;
import aldi.repository.SupplierRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class DatabaseSeedConfig {

    @Bean
    CommandLineRunner commandLineRunner(SupplierRepository supplierRepository) {
        return args -> {
            Supplier cocacola = new Supplier(
                    "Coca-Cola Co.",
                    "supplier.cocacola@gmail.com",
                    "ASDF123",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Supplier mars = new Supplier(
                    "Mars Inc.",
                    "supplier.mars@gmail.com",
                    "ABCD123",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );

            supplierRepository.saveAll(
                    List.of(cocacola, mars)
            );
        };
    }
}
