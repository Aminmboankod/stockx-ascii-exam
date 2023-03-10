package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Bids implements Criteria{


    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> filter = new ArrayList<Offer>();
        
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Bid){
                filter.add(offer);
            }
        }
        return filter;
    }
    
}
