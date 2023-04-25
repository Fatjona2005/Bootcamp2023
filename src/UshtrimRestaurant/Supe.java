package UshtrimRestaurant;

public class Supe extends Dish{

    public Supe(int price, String nameOfDish){
        super(price,nameOfDish);
        getIngrediente().add(new Ingrediente("Uje", (long) 50,true,false));
        getIngrediente().add(new Ingrediente("Kripe", (long) 100,true,false));
        getIngrediente().add(new Ingrediente("Veze", (long) 50,true,true));
    }
}
