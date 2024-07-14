package org.example.domain.cart;

import org.example.domain.promotion.Promotion;
import org.example.domain.promotion.PromotionRepository;

import java.math.BigDecimal;

public class CartService {

    private CartRepository cartRepository;
    private PromotionRepository promotionRepository;

    public void addItem(String cartId, Product product, Integer qty, BigDecimal price) {
        Cart cart = cartRepository.get(cartId);
        cart.addItem(product, qty, price);
        cartRepository.save(cart);
    }

    public Cart getCart(String cartId) {
        return cartRepository.get(cartId);
    }

    public void applyPromotion(String promotionId, String cartId) {
        Promotion promotion = promotionRepository.get(promotionId);
        Cart cart = cartRepository.get(cartId);
        cart.applyPromotion(promotion);
        cartRepository.save(cart);
    }
}
