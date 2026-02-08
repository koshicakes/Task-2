public class Main {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.fullName = "Richard Valentos";

        Transaction t = new Transaction(c);

        t.product.modelName = "Vivo Y11";
        t.product.price = 3999.00;

        System.out.println(
            c.identify() + "\n" +
            t.product.identify() + "\n" +
            t.identify() + "\n" +
            t.getReport()
        );
    }
}