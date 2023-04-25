package UshtrimRestaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Restorant {
    private String emri;
    private List<Order> orderList;
    private List<Customer> customer;
    private String lloji;

    public Restorant(String emri, List<Order> orderList, List<Customer> customer, String lloji) {
        this.emri = emri;
        this.orderList = orderList;
        this.customer = customer;
        this.lloji = lloji;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public String getLloji() {
        return lloji;
    }

    public void setLloji(String lloji) {
        this.lloji = lloji;
    }

    public Restorant() {
        orderList = new ArrayList<>();
        customer = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Restorant{" +
                "emri='" + emri + '\'' +
                ", orderList=" + orderList +
                ", customer=" + customer +
                ", lloji='" + lloji + '\'' +
                '}';
    }

    public int setCmimi2(Map<Dish, Integer> dishes){

        int cmimiTot = 0;

        for(Dish dish : dishes.keySet()) {

            cmimiTot = cmimiTot + dish.getPrice() * dishes.get(dish);

        }
        return cmimiTot;
    }

    public Order vendosPorosi(Map<Dish, Integer> dishes , List<Customer> customer){

        Order order = new Order(setCmimi2(dishes), dishes, customer);
        orderList.add(order);
        return order;
    }

    //-> merrPorosiTeCustomer(Customer customer); 

    public List<Order> merrPorosiTeCustomer(Customer customer){
        List<Order> ordersCustomer = new ArrayList<>();
        for(int i = 0; i < orderList.size(); i++){

            for(int j = 0; j < orderList.get(i).getCustomer().size(); j++){
                if(orderList.get(i).getCustomer().get(j).getNidCustomer()== customer.getNidCustomer()){
                    ordersCustomer.add(orderList.get(i));
                }
            }
        }
        return ordersCustomer;
    }

    public List<Dish> merrDishTeCustomer(Customer customer){
        List<Order> orders = merrPorosiTeCustomer(customer);
        List<Dish> dishes = new ArrayList<>();
        for(int i = 0; i < orders.size(); i++){
            dishes.addAll(orders.get(i).getDishes().keySet());
        }
        return dishes;
    }

    // shfaq customer qe ka bere porosine e dhene si parameter 
    List<Customer> shfaqCustomersTePorosise (Order order) {

        for(Order o : orderList) {
            if(o.getId() == order.getId()) {
                return o.getCustomer();
            }
        }
        return new ArrayList<>();
    }

    // merr ne konsiderate koston totale te porosise dhe kthe Orderin qe kete kosto e ka me te larte.
    public Order shfaqPorosineMeTeShtrenjte() {
        Order cmimiMeIMadh = new Order();
        for(int i = 0; i<orderList.size(); i++) {
            if(orderList.get(i).getCmimi() > cmimiMeIMadh.getCmimi()) {
                cmimiMeIMadh = orderList.get(i);
            }
        }
        return cmimiMeIMadh;
    }

}
