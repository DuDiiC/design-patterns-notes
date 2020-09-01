import pizza.Pizza;
import pizza.PizzaWithBasil;
import pizza.PizzaWithHam;
import pizza.PizzaWithPineapple;

import java.text.DecimalFormat;
import java.util.List;

// Target class, restaurant for example
public class DecoratorExample {

    public static void main(String[] args) {

        Pizza margherita = new Pizza();
        Pizza withHam = new PizzaWithHam(margherita);
        Pizza withHamAndPeanapple = new PizzaWithPineapple(withHam);
        Pizza withHamAndPeanappleAndBasil = new PizzaWithBasil(withHamAndPeanapple);

        DecimalFormat df = new DecimalFormat("#,00 zł");

        for(Pizza pizza : List.of(margherita, withHam, withHamAndPeanapple, withHamAndPeanappleAndBasil)) {
            System.out.printf("%s costs %s.%n", pizza, df.format(pizza.getPrice()));
        }
    }
}
