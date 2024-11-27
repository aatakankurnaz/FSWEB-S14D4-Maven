package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("bitter", 50, "acı");
        products[1] = new Coke("cocacola", 40, "soğuk");
        products[2] = new Bread("kepek", 10, "sağlıklı");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i = 0; i < products.length; i++) {
            products[i].showDetails();
        }
    }
}