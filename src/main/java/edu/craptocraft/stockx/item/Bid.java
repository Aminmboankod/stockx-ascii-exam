package edu.craptocraft.stockx.item;


public class Bid implements Offer{

    private String size;
    private int bid;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "size: "+this.size+", bid: "+this.bid;
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
