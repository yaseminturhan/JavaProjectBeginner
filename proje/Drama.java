package proje;

import proje.Movie;

public class Drama extends Movie {

    public Drama(int id, int quantity, String name, int price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.type = "Drama";
    }

    public String toString() {
        return id +
                ":"+
                "Drama{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}