import behaviors.FlyBehavior;
import behaviors.QuackBehavior;
import implementations.FlyNoWings;
import implementations.Quack;

public class DecoyDuck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public DecoyDuck() {
        flyBehavior = new FlyNoWings();
        quackBehavior = new Quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("Sou um pato de mentira");
    }
}
