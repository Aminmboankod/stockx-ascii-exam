package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class MaxBid implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        
        List<Offer> filter = new ArrayList<Offer>();
        float maxValue = 0;
    
        for (Offer offer: sneaker.offers()) {
            if (offer instanceof Bid && offer.value() > maxValue) {
                filter.clear();
                filter.add(offer);
                maxValue = offer.value();
            }
        }
        return filter;
    }

}
