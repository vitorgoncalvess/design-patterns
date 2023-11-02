package coffe;

import components.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend Coffe");
    }

    @Override
    public Double cost() {
        return .89 / getSize().multiplier();
    }
}
