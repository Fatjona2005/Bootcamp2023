package UshtrimRestaurant;

public class Customer {

    private static int ID;
    private String emri;
    private int nidCustomer;
    private String addOfCustomer;

    public Customer(String emri, String addOfCustomer) {
        ID++;
        this.emri = emri;
        this.nidCustomer = ID;
        this.addOfCustomer = addOfCustomer;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getNidCustomer() {
        return nidCustomer;
    }

    public void setNidCustomer(int nidCustomer) {
        this.nidCustomer = nidCustomer;
    }

    public String getAddOfCustomer() {
        return addOfCustomer;
    }

    public void setAddOfCustomer(String addOfCustomer) {
        this.addOfCustomer = addOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "emri='" + emri + '\'' +
                ", nidCustomer=" + nidCustomer +
                ", adresa='" + addOfCustomer + '\'' +
                '}';
    }
}
