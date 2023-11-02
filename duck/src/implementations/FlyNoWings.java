package implementations;

import behaviors.FlyBehavior;

public class FlyNoWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Não consigo voar");
    }
}
