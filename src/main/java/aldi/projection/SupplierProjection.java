package aldi.projection;

import java.time.LocalDate;

//Task No 5. as alternative solution
public interface SupplierProjection {
    String getName();
    String getEmail();
    LocalDate getContractStartDate();
    Integer getYearsInPartnership();

}
