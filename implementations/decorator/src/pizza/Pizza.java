package pizza;

import java.math.BigDecimal;

// Component class
public class Pizza {

    private static final BigDecimal BASE_PRICE = new BigDecimal(15);

    public BigDecimal getPrice() {
        return BASE_PRICE;
    }

    @Override
    public String toString() {
        return "Pizza";
    }
}
