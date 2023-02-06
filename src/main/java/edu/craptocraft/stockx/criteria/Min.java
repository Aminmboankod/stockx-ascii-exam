package edu.craptocraft.stockx.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Min implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria size, Criteria bids) {
        this.criteria = size;
        this.otherCriteria = bids;
    }
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> sizeAsk = sneaker.offers();
        final int[] minValue = {Integer.MAX_VALUE};
        //pruebo los lambda en Java//
        criteria.checkCriteria(sneaker).forEach(offer -> minValue[0] = Math.min(minValue[0], offer.value()));
        sizeAsk.removeIf(o -> o.value() > minValue[0] || !otherCriteria.checkCriteria(sneaker).contains(o));
        return sizeAsk;
    }
}
