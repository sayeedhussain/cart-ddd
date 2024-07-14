package org.example.domain.cart;

public class CartRepository {

    public Cart get(String cartId) {
        return new Cart("user1");
    }

    public void save(Cart cart) {
    }
}
