package UshtrimRestaurant;

public class Ingrediente {

    private String emri;
    private static int ID;
    private int id;
    private Long kaloriPer100gr;
    private boolean eshteVegjetariane;
    private boolean eshteGlutenFree;

    public Ingrediente(String emri, Long kaloriPer100gr, boolean eshteVegjetariane, boolean eshteGlutenFree) {
        ID++;
        this.emri = emri;
        this.kaloriPer100gr = kaloriPer100gr;
        this.eshteVegjetariane = eshteVegjetariane;
        this.eshteGlutenFree = eshteGlutenFree;
        this.id=ID;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getKaloriPer100gr() {
        return kaloriPer100gr;
    }

    public void setKaloriPer100gr(Long kaloriPer100gr) {
        this.kaloriPer100gr = kaloriPer100gr;
    }

    public boolean isEshteVegjetariane() {
        return eshteVegjetariane;
    }

    public void setEshteVegjetariane(boolean eshteVegjetariane) {
        this.eshteVegjetariane = eshteVegjetariane;
    }

    public boolean isEshteGlutenFree() {
        return eshteGlutenFree;
    }

    public void setEshteGlutenFree(boolean eshteGlutenFree) {
        this.eshteGlutenFree = eshteGlutenFree;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "Pjata='" + getEmri() + '\'' +
                ", me id=" + getId() +
                ", ka: " + getKaloriPer100gr() + "kaloriPer100gr"+
                ", Vegjetariane=" + eshteVegjetariane +
                ", GlutenFree=" + eshteGlutenFree +
                '}';
    }
}
