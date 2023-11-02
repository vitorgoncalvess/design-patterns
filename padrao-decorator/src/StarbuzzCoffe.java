import coffe.DarkRoast;
import coffe.Expresso;
import coffe.HouseBlend;
import components.Beverage;
import condiments.Mocha;
import condiments.Soy;
import condiments.Whip;

public class StarbuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        beverage.setSize("venti");
        System.out.printf("%s $%.2f\n", beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}