package implementations;

import behaviors.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Estou voando em um foguete!");
    }
}
