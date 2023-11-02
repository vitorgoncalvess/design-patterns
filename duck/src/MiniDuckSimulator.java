import implementations.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        System.out.println("---");

        Duck model = new ModelDuck();

        model.performQuack();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());

        model.performFly();

    }
}