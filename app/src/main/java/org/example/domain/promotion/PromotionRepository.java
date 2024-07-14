package org.example.domain.promotion;

import java.time.Instant;
import java.util.Date;

public class PromotionRepository {

    public Promotion get(String promotionId) {
        return new Promotion("name", "PROMO_1", Date.from(Instant.now()));
    }

    public void save(Promotion promotion) {
    }
}
