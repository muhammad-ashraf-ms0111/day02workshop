package ModelAnswer.cart;

public class Apple extends Item {

    //attribute
    private String type;

    //constructor overrides item
    public Apple() {
        super("c-apple", "Apple");
    }

    //getters and setter
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

}