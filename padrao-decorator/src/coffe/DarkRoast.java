package coffe;

import components.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast Coffe");
    }

    @Override
    public Double cost() {
        return .99 / getSize().multiplier();
    }
}
