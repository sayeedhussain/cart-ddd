package org.example.domain.cart;

import org.example.domain.promotion.Promotion;

import java.math.BigDecimal;
import java.util.List;

public class Cart {
    String id;
    String userId;
    Integer totalQty;
    String promotionId;
    List<LineItem> lineItems;
    Amounts amounts;

    public Cart(String userId) {
        this.id = ""; //some generated id
        this.userId = userId;
    }

    public void addItem(Product product, Integer qty, BigDecimal price) {
        LineItem item = new LineItem(product, qty, price);
        this.lineItems.add(item);
        this.amounts.subtotal.add(item.totalPrice);
        this.amounts.total = this.amounts.subtotal.subtract(this.amounts.discount);
    }

    public void applyPromotion(Promotion promotion) {
        this.promotionId = promotion.id;
        this.amounts.discount = this.amounts.subtotal.multiply(promotion.discountPercentage.divide(BigDecimal.valueOf(100)));
        this.amounts.total = this.amounts.subtotal.subtract(this.amounts.discount);
    }
}
