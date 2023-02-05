package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.craptocraft.stockx.criteria.MinAsk;

public class MinAskTest {
    @Test
    public void checkCriteriaMinAskTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Ask ask = new Ask("13", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));
        MinAsk min = new MinAsk();

        List<Offer> expected = new ArrayList<>();
        expected.add(ask);

        assertEquals(expected, min.checkCriteria(sneaker) );
    }
}
