package ch.heigvd.res.pizza.domain.Thorkal;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Paysanne implements IProduct {

    public final static String NAME = "Paysanne";
    public final static BigDecimal PRICE = new BigDecimal(18.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
