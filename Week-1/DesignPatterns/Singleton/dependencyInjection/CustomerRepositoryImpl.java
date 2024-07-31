// CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulating a database lookup
        if ("123".equals(id)) {
            return new Customer("123", "John Doe");
        }
        return null;
}
}