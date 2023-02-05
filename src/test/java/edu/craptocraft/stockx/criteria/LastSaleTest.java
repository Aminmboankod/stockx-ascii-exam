package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LastSaleTest {
    @Test
    public void constructorLastSaleTest() {
        Criteria lastSale = new LastSale();
        assertNotNull(lastSale);
    }
}
