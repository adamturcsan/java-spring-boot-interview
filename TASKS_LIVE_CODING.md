# ALDI Java Spring Boot Interview - Live Coding

### 1. task

The Supplier entity has a **contractStartDate** property, and it is currently being saved as such in the database. Ensure that it is saved as contract_start_date in the database without changing the property name.

### 2. task

Create a derived/computed/calculated **yearsInPartnership** property for the Supplier class. Display this value in the result of the supplier collection query. The meaning of this value is the number of the years since the **contractStartDate**. Don't store in the database!

### 3. task

Modify the deletion of the Supplier resource so that if the supplier does not exist, an IllegalStateException is thrown.

### 4. task

The Supplier entity contains a sensitive password field that is currently returned in queries. Adjust the output to exclude the password field without modifying the entity. Implement this using a DTO solution and mention two other alternatives.

### 5. task

Use a DTO for creating a Supplier entity and validate the values in the DTO.

- name - mandatory
- email - mandatory and email format
- password - mandatory
- contractStartDate - mandatory

### 6. task

Create a Product resource with the following REST endpoints:

**Schema:**

- id (Long)
- name (String)
- unit_net_price (Double)
- quantity (Double)
- active (boolean)

**Endpoints:**

- Get one
- Get all
- Create one
- Delete one

Prepare an .http file for testing these endpoints.

Also, modify it so that every Product is associated with a Supplier. When displaying suppliers, include their products, but when displaying products, there’s no need to show their suppliers.

### 7. task

In the ProductHelper class, create a static method that accepts a Supplier and a list of products as parameters. This method should return only the products belonging to that supplier and only the ones that are active. Write a unit test for this method.

```
public static List<Product> filterActiveProductsBySupplier(Supplier supplier, List<Product> products);
```

### 8. task

Create a configuration property named vat.key with a value of 27, and implement a PriceCalculator class that takes a Product as a parameter and returns its gross price. Write a unit test for this method.

### 9. task

One of your dev colleagues asks a review, but it's really ugly (I mean the code). Please refactor the DummyHelper.filterByDivisors method without breaking the existing tests! Make it as clean code as possible!

### 10. task

During the database migration in DatabaseSeedConfig, an error might occur. How would you handle the situation if an error happens while creating products after the suppliers have already been created? How would you revert the entire migration in case of error?

