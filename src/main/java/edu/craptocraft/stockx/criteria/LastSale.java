package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sale;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> lastSale = new ArrayList<>();
        
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Sale) {
                lastSale.add(offer);
            }
        }
        
        Offer last = lastSale.get(lastSale.size() - 1);
        lastSale.clear();
        lastSale.add(last);
        return lastSale;
      }
}
