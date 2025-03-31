package mar1;

public class Product {
    String description;
    double price;
    String brand;


    public Product(double price, String description, String brand) {
        this.price = price;
        this.description = description;
        this.brand = brand;
    }
    public void printDetails(){
        System.out.println(price);
        System.out.println(description);
        System.out.println(brand);
    }

}

