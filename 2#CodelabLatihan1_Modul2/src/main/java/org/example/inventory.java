package org.example;

public class inventory {
    private Product product;
    private String location;

    public inventory (Product product, String location){
        this.setLocation(location);
        this.setProduct(product);
    }
    public void showInfentory(){
        System.out.println("Location: " + getLocation()) ;
        getProduct().displayProduct();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
