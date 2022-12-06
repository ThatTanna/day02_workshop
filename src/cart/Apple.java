package src.cart;

public class Apple extends Item {

    private String type;

    public Apple() {
        super("c-apple", 10, 0.5f);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
