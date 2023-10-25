import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Categories
        Category category1 = new Category("Electronic", "Electronic products category");
        Category category2 = new Category("Sport", "Sport products category");

        // Products
        Product product1 = new Product("Laptop", 8500, category1);
        Product product2 = new Product("Basketball-Shoes", 1500, category2);

        // Order List
        List<Product> orderProducts = new ArrayList<>();
        orderProducts.add(product1);
        orderProducts.add(product2);
        Order order = new Order(1, orderProducts, product1.getPrice() + product2.getPrice());

        // User
        User user = new User("Abdulkadir Aydemir", "blabla@gmail.com", "pw123123");
        System.out.println("Category: " + category1.getName() + ", Explain: " + category1.getDescription());
        System.out.println("Product: " + product1.getName() + ", Price: " + product1.getPrice() + ", Category: " + product1.getCategory().getName());
        System.out.println("Order ID: " + order.getOrderId() + ", Total Price: " + order.getTotalPrice());
        System.out.println("User Name: " + user.getUsername() + ", Email: " + user.getEmail());
    }

}
