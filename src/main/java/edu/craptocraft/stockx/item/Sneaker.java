package edu.craptocraft.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    private String style;
    private String name;
    public List<Offer> offers;
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
    public String getAsk() {
        return "0";
    }

    @Override
    public String getBid() {
        return "0";
    }

    @Override
    public String getSale() {
        return "0";
    }

    @Override
    public void add(Offer bid) {
        this.offers().add(bid);
        
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public void setBid(int bid) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setAsk(int ask) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setSale(int sale) {
        // TODO Auto-generated method stub
        
    }

}
