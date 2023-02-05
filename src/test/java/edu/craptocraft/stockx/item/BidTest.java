package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BidTest {
    @Test
    public void constructorBidTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Bid bid = new Bid("6", 200);
        sneaker.add(bid);
        assertEquals("size: 6, bid: 200", bid.toString());
    }
}
