package bank;

/**
 * Created by pedro on 9/14/15.
 */
public class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * Metode per retornar l' Id
     * @return id
     */
    public String getId(){
        return id;
    }
    /**
     * Metode per retornar el nom
     * @return name
     */
    public String getName(){
        return name;
    }

    
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
