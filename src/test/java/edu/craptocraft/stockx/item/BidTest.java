package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BidTest {
    @Test
    public void constructorBidTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Bid bid = new Bid("6", 200);
        sneaker.add(bid);
        assertEquals("\t 6\t\t\t200\n", bid.toString());
    }

    @Test
    public void añadirOffersBid() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Bid bid = new Bid("13", 550);
        sneaker.add(bid);
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        assertNotNull(bid);    
    }

}
