package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Max implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria size, Criteria bids) {
        this.criteria = size;
        this.otherCriteria = bids;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        List<Offer> filter = new ArrayList<Offer>();
        List<Offer> checkCriteria1 = criteria.checkCriteria(sneaker);
        List<Offer> checkCriteria2 = otherCriteria.checkCriteria(sneaker);
        for (Offer offer : checkCriteria1) {
            for (Offer otherOffer : checkCriteria2) {
                if (offer.equals(otherOffer)) {
                    if (filter.isEmpty()) {
                        filter.add(offer);
                        continue;
                    }
                    if (offer.value() > filter.get(0).value()) {
                        filter.clear();
                        filter.add(offer);
                    }
                }
            }
        }
        return filter;
    }
}
    
