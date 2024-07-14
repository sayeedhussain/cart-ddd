package org.example.application;

import org.example.domain.cart.Cart;
import org.example.domain.cart.CartService;
import org.example.domain.cart.Product;

import java.math.BigDecimal;

public class CartController {

    private CartService cartService;

    public void addItem(String cartId, Product product, Integer qty, BigDecimal price) {
        cartService.addItem(cartId, product, qty, price);
    }

    public Cart getCart(String cartId) {
        return cartService.getCart(cartId);
    }

    public void applyPromotion(String promotionId, String cartId) {
        cartService.applyPromotion(promotionId, cartId);
    }
}
