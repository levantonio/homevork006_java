package Homevork6;


public class Laptop {
    private String brand;
    private String model;
    private String color;
    private int price;

    public Laptop(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }


    public int getPrice() {
        return price;
    }

}




