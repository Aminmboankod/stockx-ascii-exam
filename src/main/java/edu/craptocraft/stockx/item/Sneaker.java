package edu.craptocraft.stockx.item;

public class Sneaker implements Item {

    private String style;
    private String name;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Style: "+ this.style +", name: "+ this.name;
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

}
