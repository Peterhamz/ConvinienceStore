package org.example.model;

public class Product {
    private String productName;
    private String expDate;
    private String mfgtDate;

    public Product() {

    }

    public Product(String productName, String expDate, String mfgtDate) {
        this.productName = productName;
        this.expDate = expDate;
        this.mfgtDate = mfgtDate;
    }
}
