package edu.craptocraft.stockx.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class AndCriteria implements Criteria {

    private Criteria size;
    private Criteria sales;

    public AndCriteria(Criteria size, Criteria sales) {
        this.size = size;
        this.sales = sales;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        // TODO Auto-generated method stub
        return null;
    }
    
}