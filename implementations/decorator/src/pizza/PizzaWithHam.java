package pizza;

import java.math.BigDecimal;

// Concrete Decorator class
public class PizzaWithHam extends PizzaWithTopping {

        private static BigDecimal HAM_PRICE = new BigDecimal(5);

        public PizzaWithHam(Pizza basePizza) {
            super(basePizza, HAM_PRICE);
        }
}
