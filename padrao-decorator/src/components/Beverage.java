package components;

import sizes.Size;
import sizes.SizeFactory;
import sizes.Venti;

public abstract class Beverage {

    private String description = "Unknown condiments";

    private Size size = new Venti();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract Double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(String type) {
        this.size = SizeFactory.createSize(type);
    }
}
