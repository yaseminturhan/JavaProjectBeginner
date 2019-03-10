package proje;

import proje.Movie;


public class Action extends Movie {

    public Action(int id, int quantity, String name, int price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.type = "Action";
    }

    public String toString() {
        return id +
                ":"+
                "Action{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}

