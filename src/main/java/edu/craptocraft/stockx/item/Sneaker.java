package edu.craptocraft.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    private String style;
    private String name;
    public List<Offer> offers;
    public int ask;
    public int bid;
    public int sale;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
        this.offers = new ArrayList<Offer>();
    }

    private String getStyle() {
        return this.style;
    }

    private String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return "\tStyle: "+ getStyle() +"\n \tname: "+ getName();
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public void add(Offer offer) {
        this.offers().add(offer);
        
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
        
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
        
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
        
    }

}
