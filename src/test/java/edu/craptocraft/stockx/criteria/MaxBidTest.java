package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sneaker;

public class MaxBidTest {
    
    @Test
    public void checkCriteriaTestMaxBid() {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Bid bid = new Bid("13", 550);
        sneaker.add(bid);
        sneaker.add(new Bid("6", 200));
        MaxBid max = new MaxBid();

        List<Bid> expected = new ArrayList<>();
        expected.add(bid);
        
        assertEquals(expected, max.checkCriteria(sneaker));
    }
}
