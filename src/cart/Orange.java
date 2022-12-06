package src.cart;

public class Orange extends Item {

    private String type;

    public Orange() {
        super("mandarin", 5, 0.3f);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
