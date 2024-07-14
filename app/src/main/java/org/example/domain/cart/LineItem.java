package org.example.domain.cart;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

public class LineItem {
    String id;
    Product product;
    Integer qty;
    BigDecimal unitPrice;
    BigDecimal totalPrice;

    public LineItem(Product product, Integer qty, BigDecimal unitPrice) {
        this.id = ""; //some generated id
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = unitPrice.multiply(BigDecimal.valueOf(qty));
    }
}
