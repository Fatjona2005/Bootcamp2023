package UshtrimRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Dish {

    private int price;
    private String nameOfDish;
    private static int ID;
    private int id;
    private List<Ingrediente> ingrediente;

    public Dish(int price, String nameOfDish,List<Ingrediente> ingrediente) {
        ID++;
        this.price = price;
        this.nameOfDish = nameOfDish;
        this.id = ID;
        this.ingrediente = ingrediente;
    }

    public Dish(int price, String nameOfDish) {
        this(price, nameOfDish, new ArrayList<>());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "price=" + price +
                ", nameOfDish='" + nameOfDish + '\'' +
                ", id=" + id +
                ", ingrediente=" + ingrediente +
                '}';
    }
}
