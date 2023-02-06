package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Size implements Criteria {

    private String size;

    public Size(String size) {
        this.size = size;

    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> filter = new ArrayList<Offer>();

        for (Offer offer : sneaker.offers()) {
            if (offer.size().equals(this.size)) {
                filter.add(offer);
            }
        }
        return filter;
    }
    
}