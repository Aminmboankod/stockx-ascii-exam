package edu.craptocraft.stockx;

import edu.craptocraft.stockx.item.Offer;

public class Ask implements Offer{

    private String size;
    private int ask;

    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }
    
    private String getSize() {
        return this.size;
    }

    private int getAsk() {
        return this.ask;
    }

    @Override
    public String toString() {
    return "\t "+getSize()+"\t\t\t"+getAsk()+"\n";
}

    @Override
    public String size() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int value() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int compareTo(Offer arg) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
