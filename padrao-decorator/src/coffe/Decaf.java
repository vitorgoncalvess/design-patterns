package coffe;

import components.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaffe Coffe");
    }

    @Override
    public Double cost() {
        return 1.05 / getSize().multiplier();
    }
}
