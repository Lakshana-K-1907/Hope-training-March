package Day11;

import java.util.Random;

public class OrderService {
    public void placeOrder(Order order) throws OrderProcessingException {
        Product product = order.getProduct();

        if (product.getQuantity() < order.getQuantity()) {
            throw new OutOfStockException("Product out of stock");
        }

        if (!processPayment()) {
            throw new PaymentFailedException("Payment failed");
        }

        product.reduceQuantity(order.getQuantity());
        System.out.println("Order placed successfully for " + order.getUser().getName());
    }

    private boolean processPayment() {
        return new Random().nextBoolean();
    }
}
