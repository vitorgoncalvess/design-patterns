package coffe;

import components.Beverage;

public class Expresso extends Beverage {

    public Expresso() {
        setDescription("Expresso");
    }

    @Override
    public Double cost() {
        return 1.99 / getSize().multiplier();
    }

}
