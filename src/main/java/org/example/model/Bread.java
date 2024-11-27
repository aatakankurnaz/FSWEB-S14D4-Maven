package org.example.model;

public class Bread extends ProductForSale{

    private String pastry;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This product type : " + getType());
        System.out.println("This product price : " + getPrice());
        System.out.println("This product description : " + getDescription());
    }
}
