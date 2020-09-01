package pizza;

import java.math.BigDecimal;

// Concrete Decorator class
public class PizzaWithBasil extends PizzaWithTopping {

    private static BigDecimal BASIL_PRICE = new BigDecimal(1);

    public PizzaWithBasil(Pizza basePizza) {
        super(basePizza, BASIL_PRICE);
    }
}
