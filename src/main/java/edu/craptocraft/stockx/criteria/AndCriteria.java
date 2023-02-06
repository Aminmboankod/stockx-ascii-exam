package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> firstFilter = this.criteria.checkCriteria(sneaker);
        List<Offer> secondFilter = this.otherCriteria.checkCriteria(sneaker);
        List<Offer> filter = new ArrayList<Offer>();
        
        for (Offer offer : firstFilter) {

            if (secondFilter.contains(offer) && !filter.contains(offer)) {
                filter.add(offer);
            }
        }
          
        return filter;
    }
    
}