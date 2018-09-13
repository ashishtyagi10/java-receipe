package com.thinkin.javareceipe;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TaxCalculator {

    public BigDecimal calulateTaxForIncomeLessThanFiveLakh(long amount){
        BigDecimal taxAmount = BigDecimal.valueOf(0.0);
        BigDecimal taxRate = BigDecimal.valueOf(0.01);
        if(amount<500000){
            taxAmount = taxRate.multiply(new BigDecimal(amount));
        }
        return taxAmount;
    }

}
