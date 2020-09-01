package pizza;

import java.math.BigDecimal;

// Decorator class
public class PizzaWithTopping extends Pizza {

    private final Pizza basePizza;
    private final BigDecimal toppingPrice;

    public PizzaWithTopping(Pizza basePizza, BigDecimal toppingPrice) {
        this.basePizza = basePizza;
        this.toppingPrice = toppingPrice;
    }

    @Override
    public BigDecimal getPrice() {
        return basePizza.getPrice().add(toppingPrice);
    }

    @Override
    public String toString() {
        return "Pizza with toppings";
    }
}
