package proje;

public class Comedy extends Movie {

    public Comedy(int id, int quantity, String name, int price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.type = "Comedy";
    }

    public String toString() {
        return id +
                ":"+
                "Comedy{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}