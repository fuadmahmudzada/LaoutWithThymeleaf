package org.example.webwiththymeleaf.models;

import lombok.Data;

@Data
public class Product {
    private static int Id;
    public int id;
    private String name;
    private String image;
    private String type;
    private int price;

    public Product(String name, String image, String type, int price) {
        Id++;
        id=Id;
        this.name = name;
        this.image = image;
        this.type = type;
        this.price = price;
    }
}
