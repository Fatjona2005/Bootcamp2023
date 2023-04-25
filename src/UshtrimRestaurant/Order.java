package UshtrimRestaurant;

import java.util.List;
import java.util.Map;

public class Order {

    private Map<Dish, Integer> dishes;
    private static int ID;
    private int id;
    private List<Customer> customer;
    private int cmimi;

    public Order() {
    }

    public Order(Map<Dish, Integer> dishes, List<Customer> customer, int cmimi) {
        ID++;
        this.dishes = dishes;
        this.id = ID;
        this.customer = customer;
        this.cmimi = cmimi;
    }

    public Map<Dish, Integer> getDishes() {
        return dishes;
    }

    public void setDishes(Map<Dish, Integer> dishes) {
        this.dishes = dishes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public int getCmimi() {
        return cmimi;
    }

    public void setCmimi(int cmimi) {
        this.cmimi = cmimi;
    }

    @Override
    public String toString() {
        return "Order{" +
                "dishes=" + dishes +
                ", id=" + id +
                ", customer=" + customer +
                ", cmimi=" + cmimi +
                '}';
    }
}
