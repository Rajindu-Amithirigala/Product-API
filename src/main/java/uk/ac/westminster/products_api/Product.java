package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
//  Since there's no error or warning, I'd only notice by calling the endpoint in Swagger UI and checking the JSON against the class's fields, so I'd check every field after adding or changing a class.
    public double getPrice() { return price; }
}