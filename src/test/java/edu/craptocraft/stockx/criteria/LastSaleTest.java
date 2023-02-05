package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import edu.craptocraft.stockx.Stockx;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

public class LastSaleTest {
    @Test
    public void constructorLastSaleTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(new Sale("13", 372));
        Criteria lastSale = new LastSale();
        assertNotNull(lastSale);
        List<Offer> actualSale = lastSale.checkCriteria(sneaker);
        sneaker.setSale(actualSale.isEmpty()? 0 : actualSale.get(0).value());
        System.out.println(Stockx.draw(sneaker));
        assertEquals(372,lastSale.checkCriteria(sneaker).get(0).value());
    }
}
