package src.cart;

public class Item {

    // members
    private String name = "";
    private String code = "";
    private Integer quantity = 0;
    private Float price = 0f;

    public Item(String name, Integer quantity, Float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
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
    
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }

    public Float totalPrice() {
        return this.price * this.quantity;
    }
    
}