package edu.craptocraft.stockx.item;

public class Sneaker implements Item {

    private String style;
    private String name;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
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
    public void add(Bid bid) {
        // TODO Auto-generated method stub
        
    }

}
