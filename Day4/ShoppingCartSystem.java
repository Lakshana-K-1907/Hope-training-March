import java.util.*;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return this.price * this.quantity;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Price: " + price + " | Quantity: " + quantity
                + " | Total: " + getTotalPrice());
    }

    public static void main(String[] args) {
        Product[] cart = new Product[3];

        cart[0] = new Product(101, "Pen", 10.0, 5);
        cart[1] = new Product(102, "Notebook", 50.0, 2);
        cart[2] = new Product(103, "Bag", 500.0, 1);

        double grandTotal = 0;

        System.out.println("Shopping Cart Bill");

        for (int i = 0; i < cart.length; i++) {
            cart[i].display();
            grandTotal += cart[i].getTotalPrice();
        }

        System.out.println("Grand Total: " + grandTotal);
    }
}
