package org.example.model;

public class Chocolate extends ProductForSale{

    private int calories;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This product type : " + getType());
        System.out.println("This product price : " + getPrice());
        System.out.println("This product description : " + getDescription());
    }
}
