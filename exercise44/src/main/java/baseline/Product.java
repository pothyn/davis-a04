/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

public class Product {

    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {

        // Set all private variables equal to these values
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
