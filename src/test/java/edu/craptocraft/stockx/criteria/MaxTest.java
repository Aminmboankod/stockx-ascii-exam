package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sneaker;

public class MaxTest {
    
    @Test
    public void checkCriteriaMax() {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Criteria bids = new Bids();
        Criteria size = new Size("9.5");
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
        Criteria sizeMaxBid = new Max(size, bids);
        List<Offer> sizeBid = sizeMaxBid.checkCriteria(sneaker);
        sneaker.setBid(sizeBid.isEmpty()? 0 : sizeBid.get(0).value());
        System.out.println("\n\t\t MAX BID 9.5 US: " + sneaker.getBid());
        assertEquals(480, sneaker.getBid()); 
    }
}
