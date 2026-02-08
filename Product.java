public class Product{
    public String modelName;
    public double price;

    public String identify(){
        return "I am the Product class. I hold information about the product details: ";

    }

    public String getDetails(){
        return "Product Name: " + modelName + "\nPrice: PHP" + price;
    }
}