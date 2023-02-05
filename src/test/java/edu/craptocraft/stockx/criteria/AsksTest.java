package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sneaker;

public class AsksTest {

    @Test
    public void checkCriteriaAsk() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Ask ask = new Ask("13", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
        Criteria asks = new Asks();
        System.out.println("\n\t\t All ASKS");
        asks.checkCriteria(sneaker).forEach(System.out::print);
        assertNotNull(asks.checkCriteria(sneaker));
    }
    
}
