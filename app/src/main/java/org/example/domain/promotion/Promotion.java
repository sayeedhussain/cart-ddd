package org.example.domain.promotion;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

public class Promotion {

    public String id;
    public String name;
    public String code;
    public BigDecimal discountPercentage;
    private Date expiryDate;

    public Promotion(String name, String code, Date expiryDate) {
        this.name = name;
        this.code = code;
        this.expiryDate = expiryDate;
    }


    public Boolean isValid() {
        return Date.from(Instant.now()).before(expiryDate);
    }
}
