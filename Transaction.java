public class Transaction {
    public Customer customer;
    public Product product;

    // Constructor
    public Transaction(Customer c) {
        customer = c;
        product= new Product();
        product.modelName = "Default";
        product.price = 0.0;
    }

    //Identifier
    public String identify() {
        return "I am the Transaction class. I record customer purchases.";
    }

    //Format for printing transaction report
    public String getReport() {
        return "----- TRANSACTION REPORT -----\n"
               + customer.getDetails() + "\n"
               + product.getDetails();
    }
}