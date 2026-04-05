package Day11;

public class OrderSystem {
    public static void main(String[] args) {
        User user = new User("Lakshana");
        Product product = new Product("Laptop", 5);

        Order order = new Order(user, product, 2);
        OrderService service = new OrderService();

        try {
            service.placeOrder(order);
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        } catch (OrderProcessingException e) {
            System.out.println("Order processing error");
        }
    }
}
