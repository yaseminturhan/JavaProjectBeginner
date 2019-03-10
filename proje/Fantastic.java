package proje;

public class Fantastic extends Movie {

    public Fantastic(int id, int quantity, String name, int price) {
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