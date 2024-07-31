// DependencyInjectionTest.java
public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomerById("123");

        // Display customer details
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
        } else {
            System.out.println("Customer not found");
 }
    }
}