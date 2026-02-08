public class Transaction {
    public Customer customer;
    public Product productItem;

    // Constructor
    public Transaction() {
        customer = new Customer();
        customer.fullName = "Default Customer";

        productItem = new Product();
        productItem.modelName = "Default Product";
        prod
        uctItem.price = 0.0;
    }
    //Identifier
    public String identify() {
        return "I am the Transaction class. I record customer purchases.";
    }

    //Format for printing transaction report
    public String getReport() {
        return "----- TRANSACTION REPORT -----\n"
               + customer.getDetails() + "\n"
               + productItem.getDetails();
    }
}