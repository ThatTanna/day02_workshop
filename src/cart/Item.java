package src.cart;

public class Item {

    // members
    private String name = "";
    private String code = "";
    private Float price = 0f;
    private int quantity = 0;

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float totalPrice() {
        return this.price * this.quantity;
    }
    
}