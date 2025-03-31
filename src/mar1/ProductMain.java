package mar1;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 =new Product(140 , "iphone 16" , "Apple");
        Product product2 =new Product(1400 , "iphone 26" , "Apple");
        Product product3 =new Product(14 , "iphone 6" , "Apple");

        product1.printDetails();
        System.out.println();
        product2.printDetails();
        System.out.println();
        product3.printDetails();
    }
}
