package org.example;

public class Product {
    public static final double DOUBLE = 0.9; //konstanta baru
    private String name;
    private double price;
    private int stock;

    public Product(String name, double ptice, int stock) {
        this.setName(name);
        this.setPrice(ptice);
        this.setStock(stock);
    }

    public void displayProduct() {
        System.out.println("Product name: " + getName());
        System.out.println("Price: $" + getPrice());
        extracted();
        System.out.println("Stock: " + getStock());
    }

    private void extracted() {
        System.out.println("Discounted price: $" + price * DOUBLE);
    }


    public void applayStockAdjustment(int adjustment) {
        setStock(getStock() + adjustment);
        System.out.println("Stok adjustment. New stock: " + getStock());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
