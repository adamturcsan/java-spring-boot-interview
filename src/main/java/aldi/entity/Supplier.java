package aldi.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Supplier {
    @Id
    @SequenceGenerator(
            name = "supplier_sequence",
            sequenceName = "supplier_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "supplier_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDate contractStartDate;

    public Supplier() {
    }

    public Supplier(
            Long id,
            String name,
            String email,
            String password,
            LocalDate contractStartDate
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.contractStartDate = contractStartDate;
    }

    public Supplier(
            String name,
            String email,
            String password,
            LocalDate contractStartDate
    ) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.contractStartDate = contractStartDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(LocalDate contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contractStartDate=" + contractStartDate +
                '}';
    }
}
