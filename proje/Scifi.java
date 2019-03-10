package proje;

import proje.Movie;

public class Scifi extends Movie {

    public Scifi(int id, int quantity, String name, int price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.type = "Sci-fi";
    }

    public String toString() {
        return id +
                ":"+
                "Sci-fi{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}