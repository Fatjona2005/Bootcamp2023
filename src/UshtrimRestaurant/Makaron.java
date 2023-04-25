package UshtrimRestaurant;

public class Makaron extends Dish{
    public Makaron(int price, String nameOfDish){
        super(price,nameOfDish);
        getIngrediente().add(new Ingrediente("llojMakaroni", (long) 50,true,false));
        getIngrediente().add(new Ingrediente("Kripe", (long) 100,true,false));
    }
}
