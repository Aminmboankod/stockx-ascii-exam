package edu.craptocraft.stockx.criteria;

import java.util.List;

import org.junit.Test;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

public class AndCriteriaTest {
    
    @Test
    public void checkCriteriaAndTest() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        System.out.println("\n\t\t SALES 9.5 US");
        Criteria size = new Size("9.5");
        Criteria sales = new Sales();
        sales = new Sales();
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(new Sale("13", 372));
        Criteria andSizeSales = new AndCriteria(size, sales);
        andSizeSales.checkCriteria(sneaker).forEach(System.out::print);

        List<Offer> sizeSales = andSizeSales.checkCriteria(sneaker);
        sneaker.setSale(sizeSales.isEmpty()? 0 : sizeSales.get(sizeSales.size() -1).value());
        System.out.println("\n\t\t LAST SALE 9.5 US: " + sneaker.getSale());
    }
}
