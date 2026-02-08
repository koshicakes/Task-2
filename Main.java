public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Product vivo = new Product();

        customer1.fullName = "Richard Valentos";
        vivo.modelName = "Vivo Y11";
        vivo.price = 2500;

        Transaction transaction = new Transaction();
        transaction.customer = customer1;
        transaction.productItem = iPhone;

        System.out.println(
            vivo.identify() + "\n" +
            transaction.identify() + "\n" +
            transaction.getReport()
        );
    }
}