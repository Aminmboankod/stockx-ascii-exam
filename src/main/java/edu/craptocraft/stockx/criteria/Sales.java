package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sale;

public class Sales implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> filter = new ArrayList<Offer>();
        
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Sale){
                filter.add(offer);
            }
        }
        return filter;
    }
    

}
