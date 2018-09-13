package com.thinkin.javareceipe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.nio.cs.ext.Big5;
import sun.util.resources.cldr.az.TimeZoneNames_az;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxCalculatorTest {
    @Autowired
    TaxCalculator taxCalculator;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void calulateTaxForIncomeLessThanFiveLakh() throws Exception {
        BigDecimal expectedAmount = new BigDecimal("3000.00");
        BigDecimal actualAmount = taxCalculator.calulateTaxForIncomeLessThanFiveLakh(300000);
        Assert.assertEquals("Calculating tax for 300000",expectedAmount,actualAmount);
    }

}