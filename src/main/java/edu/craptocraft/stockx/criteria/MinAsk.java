package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class MinAsk implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> filter = new ArrayList<Offer>();
        float minAsk = Float.MAX_VALUE;
    
        for (Offer offer : sneaker.offers()) {

            if (offer instanceof Ask) {
                float offerValue = offer.value();

                if (offerValue < minAsk) {

                    filter.clear();
                    filter.add(offer);
                    minAsk = offerValue;

                } else if (offerValue == minAsk) {

                    filter.add(offer);
                }
            }
        }
        return filter;
    }

}
