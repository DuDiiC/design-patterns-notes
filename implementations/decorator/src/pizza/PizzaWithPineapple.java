package pizza;

import java.math.BigDecimal;

// Concrete Decorator class
public class PizzaWithPineapple extends PizzaWithTopping {

    private static BigDecimal PINEAPPLE_PRICE = new BigDecimal(3);

    public PizzaWithPineapple(Pizza basePizza) {
        super(basePizza, PINEAPPLE_PRICE);
    }
}
